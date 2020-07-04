package com.example.demo.auto;

public class Ordergoods {
    private String orderid;

    private Integer goodsId;

    private String name;

    private Integer goodsNumber;

    private String subtotal;

    private String formatedShopPrice;

    private String img;

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid == null ? null : orderid.trim();
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getGoodsNumber() {
        return goodsNumber;
    }

    public void setGoodsNumber(Integer goodsNumber) {
        this.goodsNumber = goodsNumber;
    }

    public String getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(String subtotal) {
        this.subtotal = subtotal == null ? null : subtotal.trim();
    }

    public String getFormatedShopPrice() {
        return formatedShopPrice;
    }

    public void setFormatedShopPrice(String formatedShopPrice) {
        this.formatedShopPrice = formatedShopPrice == null ? null : formatedShopPrice.trim();
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img == null ? null : img.trim();
    }
}