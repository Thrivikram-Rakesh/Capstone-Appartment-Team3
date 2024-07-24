package com.wipro.facility.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.wipro.facility.module.Facility;
import com.wipro.facility.service.FacilityService;

@RestController
@RequestMapping("/facility")
@CrossOrigin(origins = {"*"})
public class FacilityController {
	@Autowired
	private FacilityService facilityService;
	
	@PostMapping
    public ResponseEntity<Facility> addFacility(@RequestParam("id") Integer id,
                                                @RequestParam("name") String name,
                                                @RequestParam("description") String description,
                                                @RequestParam("picture") MultipartFile picture) throws IOException {
        Facility facility = new Facility();
        facility.setId(id);
        facility.setName(name);
        facility.setDescription(description);
        facility.setPicture(picture.getBytes()); // Save picture as byte array or handle as needed

        Facility createdFacility = facilityService.create(facility);

        return ResponseEntity.status(HttpStatus.CREATED).body(createdFacility);
    }
	
	@GetMapping
	public List<Facility> retrieveAllProducts() {
		return facilityService.read();
	}
	
	@GetMapping("/{id}")
	public Facility findProductById(@PathVariable("id") Integer id) {
		return facilityService.read(id);
	}
	
	@DeleteMapping("/{id}")
	public Facility deleteProduct(@PathVariable("id") Integer id) {
		return facilityService.delete(id);
	}

}
