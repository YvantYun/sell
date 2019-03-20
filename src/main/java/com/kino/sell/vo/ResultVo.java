package com.kino.sell.vo;

import lombok.Data;

/**
 * http请求返回的最外层对象
 *
 * @Author: kino
 * @Date: 2019/3/7 21:21
 */
@Data
public class ResultVo<T> {
    /**
     * 错误码
     */
    private Integer code;
    /**
     * 提示消息
     */
    private String msg;
    /**
     * 数据
     */
    private T data;
}
