package com.wipro.facility.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.facility.module.Facility;
import com.wipro.facility.repo.FacilityRepository;

import jakarta.transaction.Transactional;

@Service
public class FacilityService {
	@Autowired
	private FacilityRepository facilityRepository;
	
	@Transactional
    public void createUser() {
        Facility facility = new Facility();
        facilityRepository.save(facility);
    }
	
	public Facility create(Facility facility) {
		return facilityRepository.save(facility);
	}
	public List<Facility> read() {
		return facilityRepository.findAll();
	}
	public Facility read(Integer id) {
		Optional<Facility> temp = facilityRepository.findById(id);
		Facility facility=null;
		if(temp.isPresent())
		{
			facility=temp.get();
		}
		return facility;
	}
	public Facility delete(Integer id) {
		Facility facility=read(id);
		if(facility!=null)
		{
			facilityRepository.delete(facility);		
		}
		return facility;
	}

}
