package cn.itdeer.admin.blog.repository;

import cn.itdeer.admin.blog.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

/**
 * Description : 博客管理(文章信息)数据仓库
 * PackageName : cn.itdeer.admin.blog.repository
 * ProjectName : itdeerlab-blog
 * CreatorName : itdeer.cn
 * CreateTime : 18-12-17/下午5:11
 */
@Repository
@Transactional
public interface ArticleRepository extends JpaRepository<Article,String> {

}
