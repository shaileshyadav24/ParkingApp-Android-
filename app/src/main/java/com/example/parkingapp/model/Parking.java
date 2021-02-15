package com.example.parkingapp.model;

public class Parking {
    String buildingCode;
    String hours;
    String plateNumber;
    String suiteNo;
    String latitude;
    String longitude;
    String time;


    public Parking(String buildingCode, String hours, String plateNumber, String suiteNo, String latitude, String longitude, String time) {
        this.buildingCode = buildingCode;
        this.hours = hours;
        this.plateNumber = plateNumber;
        this.suiteNo = suiteNo;
        this.latitude = latitude;
        this.longitude = longitude;
        this.time = time;
    }

    public Parking() {
        this.buildingCode = "";
        this.hours = "";
        this.plateNumber = "";
        this.suiteNo = "";
        this.latitude = "";
        this.longitude = "";
        this.time = "";
    }

    public String getBuildingCode() {
        return buildingCode;
    }

    public void setBuildingCode(String buildingCode) {
        this.buildingCode = buildingCode;
    }

    public String getHours() {
        return hours;
    }

    public void setHours(String hours) {
        this.hours = hours;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public String getSuiteNo() {
        return suiteNo;
    }

    public void setSuiteNo(String suiteNo) {
        this.suiteNo = suiteNo;
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

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
