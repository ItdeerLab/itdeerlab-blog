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
 * CreateTime : 2018/12/17/21:56
 */
@Data
@Entity
@ToString
@Table(name = "blog_category")
public class Category implements Serializable {
    @Id
    @GeneratedValue(generator = "id")
    @GenericGenerator(name = "id", strategy = "uuid")
    @Column(name = "id", columnDefinition = "varchar(50) COMMENT 'ID编号'")
    private String id;

    @Basic
    @Column(name = "name", columnDefinition = "varchar(50) COMMENT '类别名称'")
    private String name;

    @Basic
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Column(name = "createDate", columnDefinition = "INTEGER COMMENT '添加时间'")
    private Timestamp cerateDate;

    @Basic
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Column(name = "updateDate", columnDefinition = "INTEGER COMMENT '更新时间'")
    private Timestamp updateDate;

    @Basic
    @Column(name = "description", columnDefinition = "varchar(200) COMMENT '标签描述'")
    private String description;
}
