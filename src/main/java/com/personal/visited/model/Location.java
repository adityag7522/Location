package com.personal.visited.model;


import org.springframework.data.annotation.Id;

import javax.annotation.processing.Generated;

public class Location {
    @Id
    @Generated(value = "org.hibernate.id.UUIDGenerator")
    private String id;
    private String longitude;
    private String latitude;
    private String ipAddress;

    public String getId() {
        return id;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

}
