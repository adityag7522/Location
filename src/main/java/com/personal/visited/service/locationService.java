package com.personal.visited.service;

import com.personal.visited.model.Location;
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.personal.visited.repository.locationRepository;

@Service
public class locationService {

    private locationRepository locationRepository;

    @Autowired
    locationService(locationRepository locationRepository) {
        this.locationRepository = locationRepository;
    }

    public void sendMessage(String message) {
        System.out.println(message);

        Twilio.init("ACbb411069dc00288c3ab3a50279c3d329", "a4c3d130fca6af28f0780c5942909bce");

        Message.creator(new PhoneNumber("+919718833248"),
                new PhoneNumber("+13203141930"), message).create();
    }

    public boolean insertIntoDB(Location location) {
        locationRepository.insert(location);
        sendMessage(location.getLongitude() + ", " + location.getLatitude() + ", " + location.getIpAddress());
        return true;
    }

}