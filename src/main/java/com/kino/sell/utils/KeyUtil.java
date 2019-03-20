package com.kino.sell.utils;

import java.util.Random;

/**
 * @Author: kino
 * @Date: 2019/3/10 15:02
 */
public class KeyUtil {

    /**
     * 生成唯一的主键, synchronized 防止多线程生成重复的id
     * 格式：时间 + 随机数
     * @return
     */
    public static synchronized String genUniqueKey(){
        Random random = new Random();
        //生成6位随机数
        Integer number = random.nextInt(900000) + 100000;
        return  System.currentTimeMillis() + String.valueOf(number);
    }
}
