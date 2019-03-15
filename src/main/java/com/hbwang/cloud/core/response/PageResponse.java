package com.hbwang.cloud.core.response;

import java.util.List;

/**
 * @Author: wanghongbo
 * @Date: 2018/11/23 16:38
 * @Description: 分页页面返回
 */
public class PageResponse<T> {
    /**
     * 总条数
     */
    private Integer total;
    /**
     * 行内容
     */
    private List<T> rows;
}
