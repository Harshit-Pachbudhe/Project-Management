/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.aditya.projectmanagement.model;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Data;
import java.time.LocalDate;

@Document(collection = "projects")
@Data
public class Project {

    @Id
    private String id;

    private String projectName;
    private String description;

    private LocalDate startDate;
    private LocalDate endDate;

    private String status;
    private Integer progress;
}