package com.example.weizhou.cs571;

public class ItemDetail {
    private String placeId;
    private String name;
    private String address;
    private String phoneNumber;
    private int priceLevel;
    private float rating;
    private String googlePage;
    private String website;

    ItemDetail(String placeId){
        this.placeId = placeId;
        this.name = null;
        this.address = null;
        this.phoneNumber = null;
        this.priceLevel = -1;
        this.rating = -1;
        this.googlePage = null;
        this.website = null;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public String getAddress(){
        return this.address;
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber(){
        return this.phoneNumber;
    }

    public void setPriceLevel(int priceLevel){
        this.priceLevel = priceLevel;
    }

    public int getPriceLevel(){
        return this.priceLevel;
    }

    public void setRating(float rating){
        this.rating = rating;
    }

    public float getRating(){
        return this.rating;
    }

    public void setGooglePage(String googlePage){
        this.googlePage = googlePage;
    }

    public String getGooglePage(){
        return this.googlePage;
    }

    public void setWebsite(String website){
        this.website = website;
    }

    public String getWebsite(){
        return this.website;
    }
}

