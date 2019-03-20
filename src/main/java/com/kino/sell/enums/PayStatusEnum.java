package com.kino.sell.enums;

import lombok.Getter;

/**
 * @Author: kino
 * @Date: 2019/3/7 22:48
 */
@Getter
public enum PayStatusEnum {


    WAIT(0, "等待支付"),
    SUCCESS(1, "支付成功"),

    ;

    private Integer code;

    private String message;

    PayStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
