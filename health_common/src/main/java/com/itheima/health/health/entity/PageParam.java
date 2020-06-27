package com.itheima.health.health.entity;

import java.io.Serializable;
import java.util.Date;

public class PageParam implements Serializable {
    private Integer currentPage;//页码
    private Integer pageSize;//每页记录数
    private String queryString;//查询条件
    private String queryStatus;//查询到诊情况
    private String queryType;//查询预约类型
    private Date[] queryTime;//查询预约起始时间

    public PageParam(Integer currentPage, Integer pageSize, String queryString, String queryStatus, String queryType, Date[] queryTime) {
        this.currentPage = currentPage;
        this.pageSize = pageSize;
        this.queryString = queryString;
        this.queryStatus = queryStatus;
        this.queryType = queryType;
        this.queryTime = queryTime;
    }

    public PageParam() {
    }

    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public String getQueryString() {
        return queryString;
    }

    public void setQueryString(String queryString) {
        this.queryString = queryString;
    }

    public String getQueryStatus() {
        return queryStatus;
    }

    public void setQueryStatus(String queryStatus) {
        this.queryStatus = queryStatus;
    }

    public String getQueryType() {
        return queryType;
    }

    public void setQueryType(String queryType) {
        this.queryType = queryType;
    }

    public Date[] getQueryTime() {
        return queryTime;
    }

    public void setQueryTime(Date[] queryTime) {
        this.queryTime = queryTime;
    }
}
