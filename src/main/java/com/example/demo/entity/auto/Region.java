package com.sample;


public class Region {

  private long regionId;
  private String regionLevel;
  private long parentId;
  private String regionName;


  public long getRegionId() {
    return regionId;
  }

  public void setRegionId(long regionId) {
    this.regionId = regionId;
  }


  public String getRegionLevel() {
    return regionLevel;
  }

  public void setRegionLevel(String regionLevel) {
    this.regionLevel = regionLevel;
  }


  public long getParentId() {
    return parentId;
  }

  public void setParentId(long parentId) {
    this.parentId = parentId;
  }


  public String getRegionName() {
    return regionName;
  }

  public void setRegionName(String regionName) {
    this.regionName = regionName;
  }

}
