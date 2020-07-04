package com.sample;


public class Ordergoods {

  private long goodsId;
  private String name;
  private long goodsNumber;
  private String subtotal;
  private String formatedShopPrice;
  private String img;
  private String orderid;


  public long getGoodsId() {
    return goodsId;
  }

  public void setGoodsId(long goodsId) {
    this.goodsId = goodsId;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public long getGoodsNumber() {
    return goodsNumber;
  }

  public void setGoodsNumber(long goodsNumber) {
    this.goodsNumber = goodsNumber;
  }


  public String getSubtotal() {
    return subtotal;
  }

  public void setSubtotal(String subtotal) {
    this.subtotal = subtotal;
  }


  public String getFormatedShopPrice() {
    return formatedShopPrice;
  }

  public void setFormatedShopPrice(String formatedShopPrice) {
    this.formatedShopPrice = formatedShopPrice;
  }


  public String getImg() {
    return img;
  }

  public void setImg(String img) {
    this.img = img;
  }


  public String getOrderid() {
    return orderid;
  }

  public void setOrderid(String orderid) {
    this.orderid = orderid;
  }

}
