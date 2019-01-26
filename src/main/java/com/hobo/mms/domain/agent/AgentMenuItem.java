package com.hobo.mms.domain.agent;

public class AgentMenuItem {
    private String id;

    private String name;

    private String menuid;

    private Integer showindex;

    private String uri;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getMenuid() {
        return menuid;
    }

    public void setMenuid(String menuid) {
        this.menuid = menuid == null ? null : menuid.trim();
    }

    public Integer getShowindex() {
        return showindex;
    }

    public void setShowindex(Integer showindex) {
        this.showindex = showindex;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri == null ? null : uri.trim();
    }
}