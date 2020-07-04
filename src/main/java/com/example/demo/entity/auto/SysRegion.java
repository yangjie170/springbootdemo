package com.sample;


public class SysRegion {

  private String regionId;
  private String regionName;
  private String regionShortName;
  private String regionCode;
  private String regionParentId;
  private long regionLevel;


  public String getRegionId() {
    return regionId;
  }

  public void setRegionId(String regionId) {
    this.regionId = regionId;
  }


  public String getRegionName() {
    return regionName;
  }

  public void setRegionName(String regionName) {
    this.regionName = regionName;
  }


  public String getRegionShortName() {
    return regionShortName;
  }

  public void setRegionShortName(String regionShortName) {
    this.regionShortName = regionShortName;
  }


  public String getRegionCode() {
    return regionCode;
  }

  public void setRegionCode(String regionCode) {
    this.regionCode = regionCode;
  }


  public String getRegionParentId() {
    return regionParentId;
  }

  public void setRegionParentId(String regionParentId) {
    this.regionParentId = regionParentId;
  }


  public long getRegionLevel() {
    return regionLevel;
  }

  public void setRegionLevel(long regionLevel) {
    this.regionLevel = regionLevel;
  }

}
