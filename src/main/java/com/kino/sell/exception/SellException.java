package com.kino.sell.exception;

import com.kino.sell.enums.ResultEnum;

/**
 * @Author: kino
 * @Date: 2019/3/10 14:50
 */
public class SellException extends RuntimeException {


    private Integer code;

    public SellException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());

        this.code = resultEnum.getCode();
    }

    public SellException(Integer code, String message) {
        super(message);
        this.code = code;
    }
}
