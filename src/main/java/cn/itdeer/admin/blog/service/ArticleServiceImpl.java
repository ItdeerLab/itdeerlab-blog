package cn.itdeer.admin.blog.service;

import cn.itdeer.admin.blog.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Description : 博客管理(文章信息)服务层实现
 * PackageName : cn.itdeer.admin.blog.service
 * ProjectName : itdeerlab-blog
 * CreatorName : itdeer.cn
 * CreateTime : 18-12-17/下午6:03
 */

@Service
public class ArticleServiceImpl implements ArticleService{

    @Autowired
    private ArticleRepository articleRepository;

}
