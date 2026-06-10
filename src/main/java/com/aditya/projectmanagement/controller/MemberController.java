/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.aditya.projectmanagement.controller;

import com.aditya.projectmanagement.model.Member;
import com.aditya.projectmanagement.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/members")
@CrossOrigin(origins = "http://localhost:4200")
@RequiredArgsConstructor
public class MemberController {

    private final MemberService service;

    @GetMapping
    public List<Member> getAllMembers() {
        return service.getAllMembers();
    }

    @PostMapping
    public Member save(@RequestBody Member member) {
        return service.save(member);
    }

    @PutMapping("/{id}")
    public Member update(@PathVariable String id,
                         @RequestBody Member member) {

        member.setId(id);
        return service.save(member);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id) {
        service.delete(id);
    }
}
