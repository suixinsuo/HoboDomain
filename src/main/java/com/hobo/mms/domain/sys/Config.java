package com.hobo.mms.domain.sys;

public class Config {
    private String id;

    private String configvuale;

    private String remark;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getConfigvuale() {
        return configvuale;
    }

    public void setConfigvuale(String configvuale) {
        this.configvuale = configvuale == null ? null : configvuale.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}