/**
 * Copyright (C), 2018-2019
 * FileName: Result
 * Author:   xjl
 * Date:     2019/10/5 13:58
 * Description: 结果返回
 */
package com.ShanghaiUniversity.entity;

import java.io.Serializable;

public class Result implements Serializable {
    private boolean success;
    private String message;

    public Result(boolean success, String message) {
        this.success = success;
        this.message = message;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
