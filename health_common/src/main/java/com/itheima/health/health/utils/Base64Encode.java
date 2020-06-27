package com.itheima.health.health.utils;

/**
 * 作者: kinggm Email:731586355@qq.com
 * 时间:  2020-05-01 0:08
 */

import org.apache.commons.codec.binary.Base64;

import java.io.UnsupportedEncodingException;

public class Base64Encode {

    private static final String charset = "utf-8";

    /**
     * 解码成一般字符串
     */
    public static String decode(String data) {
        try {
            if (null == data) {
                return null;
            }
            return new String(Base64.decodeBase64(data.getBytes(charset)), charset);
        } catch (UnsupportedEncodingException e) {
            System.err.println(e);
        }
        return null;
    }

    /**
     * 编码成base64字符串
     */
    public static String encode(String data) {
        try {
            if (null == data) {
                return null;
            }
            return new String(Base64.encodeBase64(data.getBytes(charset)), charset);
        } catch (UnsupportedEncodingException e) {
            System.err.println(e);
        }
        return null;
    }
}
