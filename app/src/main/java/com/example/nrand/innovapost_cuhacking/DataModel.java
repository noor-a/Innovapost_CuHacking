package com.example.nrand.innovapost_cuhacking;

public class DataModel {

    private String provider;
    private String price;
    private String service;

    public DataModel(String provider, String price, String service) {
        this.provider = provider;
        this.price = price;
        this.service = service;
    }

    public String getProvider() {
        return provider;
    }

    public String getPrice() {
        return price;
    }

    public String getService() {
        return service;
    }
}
