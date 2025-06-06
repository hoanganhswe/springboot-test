package org.projects.springboottest;

import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("api/v1/software-engineers")
public class SoftwareEngineerController {
    private final SoftwareEngineerService sweService;
    public SoftwareEngineerController(SoftwareEngineerService sweService) {
        this.sweService = sweService;
    }
    @GetMapping
    public List<SoftwareEngineer> getEngineers() {
            return sweService.getSoftwareEngineers();
    }

    @GetMapping("{id}")
    public SoftwareEngineer getEngineersById(@PathVariable Integer id) throws IllegalAccessException {
        return sweService.getSoftwareEngineersById(id);
    }

    @PostMapping
    public void addNewSoftwareEngineer(@RequestBody SoftwareEngineer softwareEngineer) {
        sweService.insert(softwareEngineer);
    }
}
