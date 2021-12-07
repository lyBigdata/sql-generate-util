package com.zmy.util.enums;

/**
 * @program: business-receipt-build-tool-parent
 * @description:
 * @author: zhangmy
 * @create: 2021-12-04 23:18
 */
public enum Order {

    ASC(0,"ASC","升序"),
    DESC(1,"DESC","降序")
    ;

    private int code;
    private String sign;
    private String description;

    Order(int code, String sign, String description) {
        this.code = code;
        this.sign = sign;
        this.description = description;
    }

    public int getCode() {
        return code;
    }

    public String getSign() {
        return sign;
    }

    public String getDescription() {
        return description;
    }

}