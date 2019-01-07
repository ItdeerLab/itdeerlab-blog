package cn.itdeer.admin.blog.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.ToString;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

/**
 * Description :
 * PackageName : cn.itdeer.admin.blog.entity
 * ProjectName : itdeerlab-blog
 * CreatorName : itdeer.cn
 * CreateTime : 2018/12/17/22:35
 */
@Data
@Entity
@ToString
@Table(name = "blog_tag")
public class Tag implements Serializable {
    @Id
    @GeneratedValue(generator = "id")
    @GenericGenerator(name = "id", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "id", columnDefinition = "varchar(50) COMMENT 'ID编号'")
    private String id;


    @Column(name = "name", columnDefinition = "varchar(50) COMMENT '标签名称'")
    private String name;


    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Column(name = "createDate", columnDefinition = "INTEGER COMMENT '添加时间'")
    private Timestamp createDate;


    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Column(name = "updateDate", columnDefinition = "INTEGER COMMENT '更新时间'")
    private Timestamp updateDate;


    @Column(name = "description", columnDefinition = "varchar(200) COMMENT '标签描述'")
    private String description;

}
