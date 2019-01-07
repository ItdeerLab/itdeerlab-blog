package cn.itdeer.admin.blog.repository;

import cn.itdeer.admin.blog.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

/**
 * Description : 博客管理(类别信息)数据仓库
 * PackageName : cn.itdeer.admin.blog.repository
 * ProjectName : itdeerlab-blog
 * CreatorName : itdeer.cn
 * CreateTime : 19-1-7/下午5:54
 */
@Repository
@Transactional
public interface CategoryRepository extends JpaRepository<Category,String> {

}
