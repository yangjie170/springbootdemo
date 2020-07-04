package com.sample;


public class User {

  private long uid;
  private String username;
  private long password;
  private String name;
  private long telephone;
  private String sex;
  private String permisson;


  public long getUid() {
    return uid;
  }

  public void setUid(long uid) {
    this.uid = uid;
  }


  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }


  public long getPassword() {
    return password;
  }

  public void setPassword(long password) {
    this.password = password;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public long getTelephone() {
    return telephone;
  }

  public void setTelephone(long telephone) {
    this.telephone = telephone;
  }


  public String getSex() {
    return sex;
  }

  public void setSex(String sex) {
    this.sex = sex;
  }


  public String getPermisson() {
    return permisson;
  }

  public void setPermisson(String permisson) {
    this.permisson = permisson;
  }

}
