package com.qf.empproject.entity;

public class Page  {
    private Integer PageIndex;
    private Integer PageSize;
    private Integer TotalCount;
    private Integer TotalPage;
    private Integer StartRows;

    public Integer getPageIndex() {
        return PageIndex;
    }

    public void setPageIndex(Integer pageIndex) {
        PageIndex = pageIndex;
    }

    public Integer getPageSize() {
        return PageSize;
    }

    public void setPageSize(Integer pageSize) {
        PageSize = pageSize;
    }

    public Integer getTotalCount() {
        return TotalCount;
    }

    public void setTotalCount(Integer totalCount) {
        TotalCount = totalCount;
        this.setTotalPage(totalCount%PageSize==0?totalCount/PageSize:(totalCount/PageSize)+1);
    }

    public Integer getTotalPage() {
        return TotalPage;
    }

    public void setTotalPage(Integer totalPage) {
        TotalPage = totalPage;

    }

    public Integer getStartRows() {
        return StartRows;
    }

    public void setStartRows(Integer startRows) {
        StartRows = startRows;
    }

    public Page(Integer pageIndex, Integer pageSize) {
        PageIndex = pageIndex;
        PageSize = pageSize;
        this.setStartRows((pageIndex-1)*pageSize);

    }

    public Page(Integer pageIndex) {
        this(pageIndex,5);
    }

}
