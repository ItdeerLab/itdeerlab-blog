package cn.itdeer.admin.system.entity;

import lombok.Data;
import lombok.ToString;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Description :
 * PackageName : cn.itdeer.admin.system.entity
 * ProjectName : itdeerlab-blog
 * CreatorName : itdeer.cn
 * CreateTime : 2018/12/17/21:49
 */
@Data
@Entity
@ToString
@Table(name = "system_user")
public class User implements Serializable {
    @Id
    @GeneratedValue(generator = "id")
    @GenericGenerator(name = "id", strategy = "uuid")
    @Column(name = "id", columnDefinition = "varchar(50) COMMENT 'ID编号'")
    private String id;

    @Basic
    @Column(name = "userName", columnDefinition = "varchar(50) COMMENT '用户名称'")
    private String userName;

    @Basic
    @Column(name = "passWord", columnDefinition = "varchar(50) COMMENT '用户密码'")
    private String passWord;
}
