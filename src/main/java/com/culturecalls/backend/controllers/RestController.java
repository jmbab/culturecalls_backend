package com.culturecalls.backend.controllers;


import com.culturecalls.backend.models.Category;
import com.culturecalls.backend.models.Location;
import com.culturecalls.backend.models.Event;
import com.culturecalls.backend.repositories.CategoryRepository;
import com.culturecalls.backend.repositories.EventRepository;
import com.culturecalls.backend.repositories.LocationRepository;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@org.springframework.web.bind.annotation.RestController

public class RestController {

    private final EventRepository eventRepository;
    private final LocationRepository locationRepository;
    private final CategoryRepository categoryRepository;


    public RestController(EventRepository eventRepository, LocationRepository locationRepository, CategoryRepository categoryRepository) {
        this.eventRepository = eventRepository;
        this.locationRepository = locationRepository;
        this.categoryRepository = categoryRepository;
    }

    @GetMapping("/events")
    public List<Event> findAllShows() {
        return eventRepository.findAll();
    }

    @GetMapping("/locations")
    public List<Location> findAllLocations(){
        return locationRepository.findAll();
    }

    @GetMapping("/categories")
    public List<Category> findAllCategories(){
        return categoryRepository.findAll();
    }


    @PostMapping(value = "/newlocation", consumes = "application/json")
    @ResponseStatus(HttpStatus.CREATED)
    public Location newLocation(@RequestBody Location location){
        return locationRepository.save(location);
    }

    @PostMapping(value = "/newevent", consumes = "application/json")
    @ResponseStatus(HttpStatus.CREATED)
    public Event newShow(@RequestBody Event show){
        return eventRepository.save(show);
    }

    @DeleteMapping("/events/{evtId}")
    public void deleteEvent(@PathVariable Long evtId){
        eventRepository.deleteById(evtId);
    }

}
