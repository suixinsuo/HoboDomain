package com.hobo.mms.domain.trans;

import java.util.Date;

public class Task {
    private String id;

    private String tasktype;

    private String taskday;

    private String status;

    private Date startdate;

    private Date enddate;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getTasktype() {
        return tasktype;
    }

    public void setTasktype(String tasktype) {
        this.tasktype = tasktype == null ? null : tasktype.trim();
    }

    public String getTaskday() {
        return taskday;
    }

    public void setTaskday(String taskday) {
        this.taskday = taskday == null ? null : taskday.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Date getStartdate() {
        return startdate;
    }

    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }

    public Date getEnddate() {
        return enddate;
    }

    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }
}