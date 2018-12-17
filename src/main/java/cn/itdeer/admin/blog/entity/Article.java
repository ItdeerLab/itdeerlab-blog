package cn.itdeer.admin.blog.entity;

import cn.itdeer.admin.system.entity.User;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.ToString;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

/**
 * Description : 博客管理(Article文章)实体类
 * PackageName : cn.itdeer.admin.blog.entity
 * ProjectName : itdeerlab-blog
 * CreatorName : itdeer.cn
 * CreateTime : 18-12-17/下午5:11
 */

@Data
@Entity
@ToString
@Table(name = "blog_article")
public class Article implements Serializable {

    @Id
    @GeneratedValue(generator = "id")
    @GenericGenerator(name = "id",strategy = "uuid")
    @Column(name = "id",columnDefinition = "varchar(50) COMMENT 'ID编号'")
    private String id;

    @Basic
    @Column(name = "title",columnDefinition = "varchar(50) COMMENT '文章标题'")
    private String title;

    @Basic
    @Column(name = "summary",columnDefinition = "varchar(200) COMMENT '文章摘要'")
    private String summary;

    @Lob
    @Basic
    @Column(name = "textContent",columnDefinition = "TEXT COMMENT 'TEXT内容'")
    private String textContent;

    @Lob
    @Basic
    @Column(name = "htmlContent",columnDefinition = "TEXT COMMENT 'HTML内容'")
    private String htmlContent;

    @Basic
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Column(name = "releaseDate",columnDefinition = "INTEGER COMMENT '发布时间'")
    private Timestamp releaseDate;

    @Basic
    @Column(name = "releaseState",columnDefinition = "BIT COMMENT '发布状态'")
    private Boolean releaseState;

    @Basic
    @Column(name = "coverPath",columnDefinition = "varchar(50) COMMENT '封面图片ID'")
    private String coverPath;

    @Basic
    @Column(name = "hits",columnDefinition = "INTEGER COMMENT '点击数'")
    private Integer hits;


    @Basic
//    @ManyToOne
    @Column(name = "category",columnDefinition = "varchar(50) COMMENT '封面图片ID'")
    private Category category;

    @Basic
    @Column(name = "tags",columnDefinition = "varchar(50) COMMENT '封面图片ID'")
    private String tags;

    @OneToOne(cascade = CascadeType.DETACH,fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

}
