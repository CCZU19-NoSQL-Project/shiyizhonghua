package com.shiyizhonghua.bean;

import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

/**
 * @ClassName: Author
 * @Description: 诗词作者实体类，作为诗词的内嵌文档
 * @Author: zhuaowei
 * @Date: 2021/11/15
 * @Version: 1.0
 */

public class Author {

    /** 作者的名字 */
    @Field(type = FieldType.Text, analyzer = "ik_max_word_pinyin", searchAnalyzer = "ik_smart_pinyin")
    private String name;

    /** 作者所处的朝代 */
    @Field(type = FieldType.Text)
    private String time;

    /** 作者描述 */
    private String desc;

    public Author() {
    }

    public Author(String name, String time, String desc) {
        this.name = name;
        this.time = time;
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", time='" + time + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
