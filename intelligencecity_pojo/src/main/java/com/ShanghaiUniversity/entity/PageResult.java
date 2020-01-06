/**
 * Copyright (C), 2018-2019
 * FileName: PageResult
 * Author:   xjl
 * Date:     2019/10/5 11:03
 * Description: 分页的包装类
 */
package com.ShanghaiUniversity.entity;

import java.io.Serializable;
import java.util.List;

public class PageResult implements Serializable {
    private long total;
    private List rows;

    public PageResult(long total, List rows) {
        this.total = total;
        this.rows = rows;
    }

    public long getTotal() {
        return total;
    }

    public List getRows() {
        return rows;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public void setRows(List rows) {
        this.rows = rows;
    }
}
