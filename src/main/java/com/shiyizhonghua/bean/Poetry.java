package com.shiyizhonghua.bean;

import lombok.experimental.Accessors;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import javax.persistence.Id;
import java.io.Serializable;
import java.util.Arrays;

/**
 * @ClassName: Poem
 * @Description: 诗的实体类，对接nosql中的数据
 * @Author: zhuaowei
 * @Date: 2021/11/15
 * @Version: 1.0
 */

@Accessors(chain = true)
@Document(indexName = "shiyizhonghua")
public class Poetry implements Serializable {
    /** id 唯一标识符 */
    @Id
    private String id;

    /** 诗词标题 */
    @Field(name = "title", type = FieldType.Text,analyzer = "ik_max_word_pinyin", searchAnalyzer = "ik_smart_pinyin")
    private String title;

    /** 诗词作者，引用作者类 */
    @Field(name = "author")
    private Author author;

    /** 诗词类型 */
    @Field(name = "type", type = FieldType.Text, analyzer = "ik_max_word_pinyin", searchAnalyzer = "ik_smart_pinyin")
    private String type;

    /** 诗词内容，数组存储，由每一句组成 */
    @Field(name = "content", type = FieldType.Text, analyzer = "ik_max_word", searchAnalyzer = "ik_smart")
    private String[] content;

    /** 创建时间（文档的创建时间） */
    @Field(name = "create_time")
    private String createTime;

    /** 更新时间（文档的更新时间） */
    @Field(name = "update_time")
    private String updateTime;

    /** 伪删除，true -> 有效; false -> 删除 */
    @Field(name = "valid_delete")
    private Boolean valid;

    @Override
    public String toString() {
        return "Poetry{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", type='" + type + '\'' +
                ", content=" + Arrays.toString(content) +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", valid=" + valid +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String[] getContent() {
        return content;
    }

    public void setContent(String[] content) {
        this.content = content;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public Boolean getValid() {
        return valid;
    }

    public void setValid(Boolean valid) {
        this.valid = valid;
    }
}
