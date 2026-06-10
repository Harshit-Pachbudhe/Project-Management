/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.aditya.projectmanagement.service;

import com.aditya.projectmanagement.model.Member;
import com.aditya.projectmanagement.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository repository;

    public List<Member> getAllMembers() {
        return repository.findAll();
    }

    public Member save(Member member) {
        return repository.save(member);
    }

    public void delete(String id) {
        repository.deleteById(id);
    }
}
