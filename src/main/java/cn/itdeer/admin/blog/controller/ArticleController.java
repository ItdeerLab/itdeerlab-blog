package cn.itdeer.admin.blog.controller;

import cn.itdeer.admin.blog.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Description : 博客管理（文章信息）Web层
 * PackageName : cn.itdeer.admin.blog
 * ProjectName : itdeerlab-blog
 * CreatorName : itdeer.cn
 * CreateTime : 18-12-17/下午5:09
 */

@Controller
public class ArticleController {

    @Autowired
    private ArticleService articleService;
}
