package com.wipro.facility.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.facility.model.Manager;

@Repository
public interface ManagerRepository extends JpaRepository<Manager, Integer> {
}
