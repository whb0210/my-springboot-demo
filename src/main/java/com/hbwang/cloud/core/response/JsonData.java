package com.hbwang.cloud.core.response;

import lombok.Data;

/**
 * @Author: wanghongbo
 * @Date: 2018/11/23 16:35
 * @Description: 返回参数
 */
@Data
public class JsonData<T> {
    private int code;
    private String message;
    private T data;
}
