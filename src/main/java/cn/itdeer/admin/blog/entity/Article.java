package cn.itdeer.admin.blog.entity;

import cn.itdeer.admin.system.entity.Pictures;
import cn.itdeer.admin.system.entity.User;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.ToString;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Set;

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
    @GenericGenerator(name = "id", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "id", columnDefinition = "varchar(50) COMMENT 'ID编号'")
    private String id;

    @Column(name = "title", columnDefinition = "varchar(50) COMMENT '文章标题'")
    private String title;

    @Column(name = "summary", columnDefinition = "varchar(200) COMMENT '文章摘要'")
    private String summary;

    @Lob
    @Column(name = "textContent", columnDefinition = "TEXT COMMENT 'TEXT内容'")
    private String textContent;

    @Lob
    @Column(name = "htmlContent", columnDefinition = "TEXT COMMENT 'HTML内容'")
    private String htmlContent;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Column(name = "releaseDate", columnDefinition = "INTEGER COMMENT '发布时间'")
    private Timestamp releaseDate;

    @Column(name = "releaseState", columnDefinition = "BIT COMMENT '发布状态'")
    private Boolean releaseState;

    @Column(name = "hits", columnDefinition = "INTEGER COMMENT '点击数'")
    private Integer hits;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    @OneToOne
    @JoinColumn(name = "picture_id")
    private Pictures picture;

    @ManyToMany
    @JoinTable(
            name = "blog_article_tags",
            joinColumns = @JoinColumn(name = "article_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "tag_id", referencedColumnName = "id")
    )
    private Set<Tag> tags;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

}
