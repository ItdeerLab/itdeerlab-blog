package cn.itdeer.admin.blog.repository;

import cn.itdeer.admin.blog.entity.Tag;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

/**
 * Description : 博客管理(标签信息)数据仓库
 * PackageName : cn.itdeer.admin.blog.repository
 * ProjectName : itdeerlab-blog
 * CreatorName : itdeer.cn
 * CreateTime : 19-1-7/下午5:55
 */
@Repository
@Transactional
public interface TagRepository extends JpaRepository<Tag,String> {

}
