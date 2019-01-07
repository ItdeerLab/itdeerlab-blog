package cn.itdeer.admin.system.entity;

import lombok.Data;
import lombok.ToString;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Description : 系统-图片-实体类
 * PackageName : cn.itdeer.admin.system.entity
 * ProjectName : itdeerlab-blog
 * CreatorName : itdeer.cn
 * CreateTime : 19-1-7/下午4:00
 */
@Data
@Entity
@ToString
@Table(name = "system_pictures")
public class Pictures implements Serializable {

    @Id
    @GeneratedValue(generator = "id")
    @GenericGenerator(name = "id", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "id", columnDefinition = "varchar(50) COMMENT 'ID编号'")
    private String id;

    
    @Column(name = "name", columnDefinition = "varchar(50) COMMENT '图片名称'")
    private String name;


    
    @Column(name = "url", columnDefinition = "varchar(100) COMMENT '图片的URL'")
    private String url;

    
    @Column(name = "description", columnDefinition = "varchar(100) COMMENT '图片的描述'")
    private String description;

}
