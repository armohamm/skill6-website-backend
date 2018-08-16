package cn.skill6.service.intf;

import java.util.List;

import cn.skill6.common.entity.po.ArticleInfo;

/**
 * 文章信息微服务接口
 *
 * @author 何明胜
 * @created at 2018年8月16日 下午10:28:04
 * @version 1.0.0
 */
public interface ArticleInfoIntf {

  int deleteByPrimaryKey(Long articleId);

  Long addArticleInfo(ArticleInfo articleInfo);

  ArticleInfo findByArticleId(Long articleId);

  List<ArticleInfo> findAll();

  void modifyByArticleId(ArticleInfo articleInfo);
}
