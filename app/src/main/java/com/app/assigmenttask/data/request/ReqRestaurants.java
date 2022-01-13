package com.app.assigmenttask.data.request;

public class ReqRestaurants {
    Double latitude;
    Double longitude;
    int page;

    public ReqRestaurants(Double latitude, Double longitude, int page) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.page = page;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }
}
