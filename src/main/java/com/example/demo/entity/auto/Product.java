package com.sample;


public class Product {

  private long pid;
  private String pname;
  private double markPrice;
  private double shopPrice;
  private String pimage;
  private java.sql.Date pdate;
  private long isHot;
  private String pdesc;
  private long pflag;
  private String detial;
  private String cid;


  public long getPid() {
    return pid;
  }

  public void setPid(long pid) {
    this.pid = pid;
  }


  public String getPname() {
    return pname;
  }

  public void setPname(String pname) {
    this.pname = pname;
  }


  public double getMarkPrice() {
    return markPrice;
  }

  public void setMarkPrice(double markPrice) {
    this.markPrice = markPrice;
  }


  public double getShopPrice() {
    return shopPrice;
  }

  public void setShopPrice(double shopPrice) {
    this.shopPrice = shopPrice;
  }


  public String getPimage() {
    return pimage;
  }

  public void setPimage(String pimage) {
    this.pimage = pimage;
  }


  public java.sql.Date getPdate() {
    return pdate;
  }

  public void setPdate(java.sql.Date pdate) {
    this.pdate = pdate;
  }


  public long getIsHot() {
    return isHot;
  }

  public void setIsHot(long isHot) {
    this.isHot = isHot;
  }


  public String getPdesc() {
    return pdesc;
  }

  public void setPdesc(String pdesc) {
    this.pdesc = pdesc;
  }


  public long getPflag() {
    return pflag;
  }

  public void setPflag(long pflag) {
    this.pflag = pflag;
  }


  public String getDetial() {
    return detial;
  }

  public void setDetial(String detial) {
    this.detial = detial;
  }


  public String getCid() {
    return cid;
  }

  public void setCid(String cid) {
    this.cid = cid;
  }

}
