/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.aditya.projectmanagement.service;

import com.aditya.projectmanagement.model.Project;
import com.aditya.projectmanagement.repository.ProjectRepository;

import java.util.List;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProjectService {

    private final ProjectRepository repository;

    public List<Project> getAllProjects() {
        return repository.findAll();
    }

    public Project save(Project project) {
        return repository.save(project);
    }

    public void delete(String id) {
        repository.deleteById(id);
    }
}