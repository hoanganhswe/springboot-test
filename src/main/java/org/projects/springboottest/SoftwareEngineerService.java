package org.projects.springboottest;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SoftwareEngineerService {
    private final SoftwareEngineerRepository sweRepository;
    public SoftwareEngineerService(SoftwareEngineerRepository sweRepository) {
        this.sweRepository = sweRepository;
    }

    public List<SoftwareEngineer> getSoftwareEngineers() {
        return sweRepository.findAll();
    }

    public void insert(SoftwareEngineer softwareEngineer) {
        sweRepository.save(softwareEngineer);
    }

    public SoftwareEngineer getSoftwareEngineersById(Integer id) throws IllegalAccessException {
        return sweRepository.findById(id).orElseThrow(() -> new IllegalAccessException(id + "not found"));
    }
}
