package com.shiyizhonghua.config;

import org.apache.http.HttpHost;
import org.apache.http.client.config.RequestConfig;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestClientBuilder;
import org.elasticsearch.client.RestHighLevelClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.StringUtils;

import java.util.Arrays;
import java.util.Objects;

/**
 * @ClassName: ElasticSearchClient
 * @Description: ElasticSearch RestHighLevelClient 配置
 * 配置 elastic search 的节点，超时时间，协议类型
 * @Author: zhuaowei
 * @Date: 2021/11/23
 * @Version: 1.0
 */

@Configuration
public class ElasticSearchClient {
    private static final int TIME_OUT = 5 * 60 * 1000;
    private static final int ADDRESS_LENGTH = 2;
    private static final String HTTP_SCHEME = "http";

    /** 节点列表，在 application{-[dev/test/prod]}.properties 中配置 */
    @Value("${elasticsearch.cluster-nodes}")
    String[] nodes;

    /**\
     * 根据节点创建 builder
     * @return 返回一个rest客户端的 builder
     */
    @Bean
    public RestClientBuilder restClientBuilder() {

        System.err.println(nodes);
        HttpHost[] hosts = Arrays.stream(nodes)
                .map(this::makeHttpHost)
                .filter(Objects::nonNull)
                .toArray(HttpHost[]::new);
        return RestClient.builder(hosts);
    }

    /**\
     * 获取 restHighLevelClient 客户端
     * @param restClientBuilder 根据节点创建的 builder
     * @return 返回一个 restHighLevelClient 客户端
     */
    @Bean
    public RestHighLevelClient getRestHighLevelClient(@Autowired RestClientBuilder restClientBuilder) {
        restClientBuilder.setRequestConfigCallback(
                new RestClientBuilder.RequestConfigCallback() {
                    @Override
                    public RequestConfig.Builder customizeRequestConfig(RequestConfig.Builder builder) {
                        return builder.setSocketTimeout(TIME_OUT);
                    }
                }
        );

        return new RestHighLevelClient(restClientBuilder);
    }

    /**\
     * 根据读取的节点配置，解析节点，创建节点
     * @param s 节点配置字符串
     * @return 返回创建的节点 httpHost
     */
    private HttpHost makeHttpHost(String s) {
        assert !StringUtils.isEmpty(s);
        String[] address = s.split(":");
        if (address.length == ADDRESS_LENGTH) {
            String ip = address[0];
            int port = Integer.parseInt(address[1]);
            System.err.println(ip + ":" + port);
            return new HttpHost(ip, port, HTTP_SCHEME);
        } else {
            return null;
        }
    }
}
