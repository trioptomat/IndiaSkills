package com.example.cakes3;

public class cakeModal {

    private String cakeName,cakePrice;

    public cakeModal(String cakeName, String cakePrice) {


        this.cakeName = cakeName;
        this.cakePrice = cakePrice;
    }

    public String getCakeName() {
        return cakeName;
    }

    public void setCakeName(String cakeName) {
        this.cakeName = cakeName;
    }

    public String getCakePrice() {
        return cakePrice;
    }

    public void setCakePrice(String cakePrice) {
        this.cakePrice = cakePrice;
    }
}
