package com.example.wy.common.tools;

import org.apache.commons.lang3.RandomStringUtils;



/**
 * <p>
 *  工具类
 * </p>
 *生成一个随机的10个字符的数字
 * @author FS
 * @since 2021-06-03
 */
public class RandomStr {
    public static String getRandomString(int i){
        String filename= RandomStringUtils.randomAlphanumeric(10);
        return filename;
    }
}
