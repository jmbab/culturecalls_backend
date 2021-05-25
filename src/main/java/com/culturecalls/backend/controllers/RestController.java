package com.culturecalls.backend.controllers;


import com.culturecalls.backend.models.Category;
import com.culturecalls.backend.models.Location;
import com.culturecalls.backend.models.Show;
import com.culturecalls.backend.repositories.CategoryRepository;
import com.culturecalls.backend.repositories.ShowRepository;
import com.culturecalls.backend.repositories.LocationRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@org.springframework.web.bind.annotation.RestController

public class RestController {

    // The following objects cannot be altered thanks to the keyword "final"
    private final ShowRepository showRepository;
    private final LocationRepository locationRepository;
    private final CategoryRepository categoryRepository;

    // Constructor
    public RestController(ShowRepository showRepository, LocationRepository locationRepository, CategoryRepository categoryRepository) {
        this.showRepository = showRepository;
        this.locationRepository = locationRepository;
        this.categoryRepository = categoryRepository;
    }

    @GetMapping("/shows")
    public List<Show> findAllShows() {
        return showRepository.findAll();
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

    @PostMapping(value = "/newshow", consumes = "application/json")
    @ResponseStatus(HttpStatus.CREATED)
    public Show newShow(@RequestBody Show show){
        return showRepository.save(show);
    }

    @PatchMapping("/shows/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Object> putShow(@RequestBody Show show, @PathVariable Long id){
        Optional<Show> showOptional = showRepository.findById(id);
        if (showOptional.isEmpty())
            return ResponseEntity.notFound().build();
        show.setId(id);
        showRepository.save(show);
        return ResponseEntity.noContent().build();
    }

    @PatchMapping("/locations/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Object> putLocation(@RequestBody Location location, @PathVariable Long id){
        Optional<Location> locationOptional = locationRepository.findById(id);
        if (locationOptional.isEmpty())
            return ResponseEntity.notFound().build();
        location.setIdLocation(id);
        locationRepository.save(location);
        return ResponseEntity.noContent().build();
    }

    @PatchMapping("/categories/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Object> putCategory(@RequestBody Category category, @PathVariable Long id){
        Optional<Category> categoryOptional = categoryRepository.findById(id);
        if (categoryOptional.isEmpty())
            return ResponseEntity.notFound().build();
        category.setIdCategory(id);
        categoryRepository.save(category);
        return ResponseEntity.noContent().build();
    }
}
