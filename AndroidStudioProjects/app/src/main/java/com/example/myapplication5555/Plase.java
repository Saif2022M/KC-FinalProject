package com.example.myapplication5555;

import java.io.Serializable;

public class Plase  implements Serializable {
    private String PlaseName ;
    private int PlaceImage ;
    private String PlaseLink ;
    private String Plasedus ;


    public Plase(String plaseName, int placeImage, String plaseLink, String plasedus) {
        PlaseName = plaseName;
        PlaceImage = placeImage;
        PlaseLink = plaseLink;
        Plasedus = plasedus;
    }

    public String getPlaseName() {
        return PlaseName;
    }

    public void setPlaseName(String plaseName) {
        PlaseName = plaseName;
    }

    public int getPlaceImage() {
        return PlaceImage;
    }

    public void setPlaceImage(int placeImage) {
        PlaceImage = placeImage;
    }

    public String getPlaseLink() {
        return PlaseLink;
    }

    public void setPlaseLink(String plaseLink) {
        PlaseLink = plaseLink;
    }

    public String getPlasedus() {
        return Plasedus;
    }

    public void setPlasedus(String plasedus) {
        Plasedus = plasedus;
    }
}
