package com.wipro.facility.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.wipro.facility.module.Booking;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Integer> {
}

