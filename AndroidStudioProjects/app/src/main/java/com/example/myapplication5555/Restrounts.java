package com.example.myapplication5555;

import java.io.Serializable;

public class Restrounts  implements Serializable {
     private String restrontName ;
     private int RestrantImage;
     private String Data1 ;
     private String Restrantdus ;

     public Restrounts(String restrontName, int restrantImage, String data1, String restrantdus) {
          this.restrontName = restrontName;
          RestrantImage = restrantImage;
          Data1 = data1;
          Restrantdus = restrantdus;
     }

     public String getRestrontName() {
          return restrontName;
     }

     public void setRestrontName(String restrontName) {
          this.restrontName = restrontName;
     }

     public int getRestrantImage() {
          return RestrantImage;
     }

     public void setRestrantImage(int restrantImage) {
          RestrantImage = restrantImage;
     }

     public String getData1() {
          return Data1;
     }

     public void setData1(String data1) {
          Data1 = data1;
     }

     public String getRestrantdus() {
          return Restrantdus;
     }

     public void setRestrantdus(String restrantdus) {
          Restrantdus = restrantdus;
     }
}