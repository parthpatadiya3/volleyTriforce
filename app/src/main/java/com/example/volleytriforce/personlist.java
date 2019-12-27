package com.example.volleytriforce;

class personlist
{
    String adminId,MobileNo,adminname,location,imageName,shop_status,shopTime1,shopTime2,latitude,longitude ;

    public personlist(String adminId, String mobileNo, String adminname, String location, String imageName, String shop_status, String shopTime1, String shopTime2, String latitude, String longitude)
    {
        this.adminId = adminId;
        this. MobileNo = mobileNo;
        this.adminname = adminname;
        this.location = location;
        this.imageName = imageName;
        this.shop_status = shop_status;
        this.shopTime1 = shopTime1;
        this.shopTime2 = shopTime2;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public String getAdminId() {
        return adminId;
    }

    public void setAdminId(String adminId) {
        this.adminId = adminId;
    }

    public String getMobileNo() {
        return MobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.MobileNo = mobileNo;
    }

    public String getAdminname() {
        return adminname;
    }

    public void setAdminname(String adminname) {
        this.adminname = adminname;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public String getShop_status() {
        return shop_status;
    }

    public void setShop_status(String shop_status) {
        this.shop_status = shop_status;
    }

    public String getShopTime1() {
        return shopTime1;
    }

    public void setShopTime1(String shopTime1) {
        this.shopTime1 = shopTime1;
    }

    public String getShopTime2() {
        return shopTime2;
    }

    public void setShopTime2(String shopTime2) {
        this.shopTime2 = shopTime2;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }
}
