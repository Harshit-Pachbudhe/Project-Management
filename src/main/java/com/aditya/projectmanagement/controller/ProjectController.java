/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.aditya.projectmanagement.controller;

import com.aditya.projectmanagement.model.Project;
import com.aditya.projectmanagement.service.ProjectService;
import java.util.List;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/projects")
@CrossOrigin(origins = "http://localhost:4200")
@RequiredArgsConstructor
public class ProjectController {

    private final ProjectService service;

    @GetMapping
    public List<Project> getAllProjects() {
        return service.getAllProjects();
    }

    @PostMapping
    public Project save(@RequestBody Project project) {
        return service.save(project);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id) {
        service.delete(id);
    }
    
   @PutMapping("/{id}")
    public Project update( @PathVariable String id,
        @RequestBody Project project)
    {
      project.setId(id);
       return service.save(project);
     }
}
