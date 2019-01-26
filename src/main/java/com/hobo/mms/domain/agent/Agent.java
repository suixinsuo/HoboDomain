package com.hobo.mms.domain.agent;

import java.util.Date;

public class Agent {
    private String id;

    private String isenterprise;

    private String name;

    private Integer agentlevel;

    private String parentid;

    private String status;

    private String reason;

    private Date signdate;

    private Date cancelsigndate;

    private String registerip;

    private String businesslicensecode;

    private String businesslicensepic;

    private String corporation;

    private String corporationidcard;

    private String corporationidcardpic;

    private String companyaddress;

    private String remark;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getIsenterprise() {
        return isenterprise;
    }

    public void setIsenterprise(String isenterprise) {
        this.isenterprise = isenterprise == null ? null : isenterprise.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getAgentlevel() {
        return agentlevel;
    }

    public void setAgentlevel(Integer agentlevel) {
        this.agentlevel = agentlevel;
    }

    public String getParentid() {
        return parentid;
    }

    public void setParentid(String parentid) {
        this.parentid = parentid == null ? null : parentid.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason == null ? null : reason.trim();
    }

    public Date getSigndate() {
        return signdate;
    }

    public void setSigndate(Date signdate) {
        this.signdate = signdate;
    }

    public Date getCancelsigndate() {
        return cancelsigndate;
    }

    public void setCancelsigndate(Date cancelsigndate) {
        this.cancelsigndate = cancelsigndate;
    }

    public String getRegisterip() {
        return registerip;
    }

    public void setRegisterip(String registerip) {
        this.registerip = registerip == null ? null : registerip.trim();
    }

    public String getBusinesslicensecode() {
        return businesslicensecode;
    }

    public void setBusinesslicensecode(String businesslicensecode) {
        this.businesslicensecode = businesslicensecode == null ? null : businesslicensecode.trim();
    }

    public String getBusinesslicensepic() {
        return businesslicensepic;
    }

    public void setBusinesslicensepic(String businesslicensepic) {
        this.businesslicensepic = businesslicensepic == null ? null : businesslicensepic.trim();
    }

    public String getCorporation() {
        return corporation;
    }

    public void setCorporation(String corporation) {
        this.corporation = corporation == null ? null : corporation.trim();
    }

    public String getCorporationidcard() {
        return corporationidcard;
    }

    public void setCorporationidcard(String corporationidcard) {
        this.corporationidcard = corporationidcard == null ? null : corporationidcard.trim();
    }

    public String getCorporationidcardpic() {
        return corporationidcardpic;
    }

    public void setCorporationidcardpic(String corporationidcardpic) {
        this.corporationidcardpic = corporationidcardpic == null ? null : corporationidcardpic.trim();
    }

    public String getCompanyaddress() {
        return companyaddress;
    }

    public void setCompanyaddress(String companyaddress) {
        this.companyaddress = companyaddress == null ? null : companyaddress.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}