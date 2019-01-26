package com.hobo.mms.domain.trans;

import java.math.BigDecimal;
import java.util.Date;

public class OrderAttachedInfo {
    private String orderid;

    private Date orderdate;

    private BigDecimal goodsnumber;

    private String goodsname;

    private BigDecimal goodscount;

    private BigDecimal goodsprice;

    private String requesturl;

    private String customername;

    private String customercardno;

    private String customertelephone;

    private String customeremail;

    private String customeridcard;

    private String customerip;

    private String remark;

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid == null ? null : orderid.trim();
    }

    public Date getOrderdate() {
        return orderdate;
    }

    public void setOrderdate(Date orderdate) {
        this.orderdate = orderdate;
    }

    public BigDecimal getGoodsnumber() {
        return goodsnumber;
    }

    public void setGoodsnumber(BigDecimal goodsnumber) {
        this.goodsnumber = goodsnumber;
    }

    public String getGoodsname() {
        return goodsname;
    }

    public void setGoodsname(String goodsname) {
        this.goodsname = goodsname == null ? null : goodsname.trim();
    }

    public BigDecimal getGoodscount() {
        return goodscount;
    }

    public void setGoodscount(BigDecimal goodscount) {
        this.goodscount = goodscount;
    }

    public BigDecimal getGoodsprice() {
        return goodsprice;
    }

    public void setGoodsprice(BigDecimal goodsprice) {
        this.goodsprice = goodsprice;
    }

    public String getRequesturl() {
        return requesturl;
    }

    public void setRequesturl(String requesturl) {
        this.requesturl = requesturl == null ? null : requesturl.trim();
    }

    public String getCustomername() {
        return customername;
    }

    public void setCustomername(String customername) {
        this.customername = customername == null ? null : customername.trim();
    }

    public String getCustomercardno() {
        return customercardno;
    }

    public void setCustomercardno(String customercardno) {
        this.customercardno = customercardno == null ? null : customercardno.trim();
    }

    public String getCustomertelephone() {
        return customertelephone;
    }

    public void setCustomertelephone(String customertelephone) {
        this.customertelephone = customertelephone == null ? null : customertelephone.trim();
    }

    public String getCustomeremail() {
        return customeremail;
    }

    public void setCustomeremail(String customeremail) {
        this.customeremail = customeremail == null ? null : customeremail.trim();
    }

    public String getCustomeridcard() {
        return customeridcard;
    }

    public void setCustomeridcard(String customeridcard) {
        this.customeridcard = customeridcard == null ? null : customeridcard.trim();
    }

    public String getCustomerip() {
        return customerip;
    }

    public void setCustomerip(String customerip) {
        this.customerip = customerip == null ? null : customerip.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}