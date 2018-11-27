package com.xiaochai.dsjspider.service.impl;

import com.xiaochai.dsjspider.entity.Page;
import com.xiaochai.dsjspider.service.IDownLoadService;
import com.xiaochai.dsjspider.util.PageDownLoadUtil;

/**
 * HttpClient页面下载实现类
 * @author: xiaochai
 * @create: 2018-11-19
 **/
public class HttpClientDownLoadService implements IDownLoadService {
    public Page download(String url) {
        Page page = new Page();
        page.setContent(PageDownLoadUtil.getPageContent(url));
        page.setUrl(url);
        return page;
    }
}
