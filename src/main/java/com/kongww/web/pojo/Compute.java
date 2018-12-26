package com.kongww.web.pojo;

/**
 * @Description:
 * @Author: QiuGuanLin
 * @version: 1.0
 */
public class Compute {
    public static int add(String x, String y) {
        int a = 0;
        int b = 0;
        try {
            a = Integer.parseInt(x);
            b = Integer.parseInt(y);
        } catch (Exception e) {
            System.err.println("Number format is illegal.");
        }
        return a + b;
    }

}
