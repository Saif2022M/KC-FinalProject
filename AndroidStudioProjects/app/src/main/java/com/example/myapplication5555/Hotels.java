package com.example.myapplication5555;

import java.io.Serializable;

public class Hotels implements Serializable {

    private String HotelName ;
    private String Hoteltqeem ;
    private int Hotelimage ;
    private int locationimage ;
    private String Hoteldus ;
    private String DATA ;

    public Hotels(String hotelName, String hoteltqeem, int hotelimage, int locationimage, String hoteldus, String DATA) {
        HotelName = hotelName;
        Hoteltqeem = hoteltqeem;
        Hotelimage = hotelimage;
        this.locationimage = locationimage;
        Hoteldus = hoteldus;
        this.DATA = DATA;
    }

    public String getHotelName() {
        return HotelName;
    }

    public void setHotelName(String hotelName) {
        HotelName = hotelName;
    }

    public String getHoteltqeem() {
        return Hoteltqeem;
    }

    public void setHoteltqeem(String hoteltqeem) {
        Hoteltqeem = hoteltqeem;
    }

    public int getHotelimage() {
        return Hotelimage;
    }

    public void setHotelimage(int hotelimage) {
        Hotelimage = hotelimage;
    }

    public int getLocationimage() {
        return locationimage;
    }

    public void setLocationimage(int locationimage) {
        this.locationimage = locationimage;
    }

    public String getHoteldus() {
        return Hoteldus;
    }

    public void setHoteldus(String hoteldus) {
        Hoteldus = hoteldus;
    }

    public String getDATA() {
        return DATA;
    }

    public void setDATA(String DATA) {
        this.DATA = DATA;
    }
}

