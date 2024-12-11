package com.personal.visited.controller;

import com.personal.visited.model.Location;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.personal.visited.service.locationService;

@RestController("")
public class locationController {

    private final locationService locationService;

    @Autowired
    locationController(locationService loc) {
        this.locationService = loc;
    }

    @PostMapping("/sendMessage")
    public ResponseEntity<?> sendMessage(@RequestBody String message) {
        locationService.sendMessage(message);
        return ResponseEntity.ok("Message sent successfully");
    }

    @GetMapping("/")
    public ResponseEntity<?> getAllLocations() {
        return ResponseEntity.ok("asdgasdfgas");
    }

    @PostMapping("/addLocation")
    public ResponseEntity<?> addLocation(@RequestBody Location location) {
        locationService.insertIntoDB(location);
        return ResponseEntity.ok("Location added successfully");
    }

}