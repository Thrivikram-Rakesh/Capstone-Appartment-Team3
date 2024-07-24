package com.wipro.facility.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.facility.model.Manager;
import com.wipro.facility.repo.ManagerRepository;

@Service
public class ManagerService {

    @Autowired
    private ManagerRepository managerRepository;

    public Manager addManager(Manager manager) {
        return managerRepository.save(manager);
    }

    public Manager getManagerById(Integer id) {
        return managerRepository.findById(id).orElse(null);
    }

    public List<Manager> getAllManagers() {
        return managerRepository.findAll();
    }

    public Manager updateManager(Integer id, Manager manager) {
        if (managerRepository.existsById(id)) {
            manager.setId(id);
            return managerRepository.save(manager);
        }
        return null;
    }

    public void deleteManager(Integer id) {
        managerRepository.deleteById(id);
    }
}
