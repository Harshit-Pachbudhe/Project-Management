package com.aditya.projectmanagement.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "members")
@Data
public class Member {

    @Id
    private String id;

    private String name;
    private String email;
    private String role;
}