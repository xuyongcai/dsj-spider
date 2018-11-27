package com.xiaochai.dsjspider.service;

import com.xiaochai.dsjspider.entity.Page;

/**
 * 页面下载接口
 *
 * @author: xiaochai
 * @create: 2018-11-19
 **/
public interface IDownLoadService {
    public Page download(String url);
}
