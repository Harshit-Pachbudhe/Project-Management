/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.aditya.projectmanagement.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.time.LocalDate;

@Document(collection = "tasks")
@Data
public class Task {

    @Id
    private String id;
    
    private String projectid;
    private String taskName;
    private String description;

    private String projectId;
    private String assignedTo;

    private String status;
    private String priority;

    private LocalDate dueDate;
}