package com.wipro.facility.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.facility.module.Facility;

@Repository
public interface FacilityRepository extends JpaRepository<Facility, Integer>{

}
