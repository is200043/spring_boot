/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.controller;

import com.example.demo.dao.StudentRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author boatc
 */
@Slf4j
@RestController
@EnableAutoConfiguration
public class WevCtrl {
    
    @Autowired
    StudentRepo studentRepo;
    
    @GetMapping(value = "/test")
    public String findCustomerButlerBycustCode() {
        log.info("Student id 10001 -> {}" , studentRepo.findById(10001));
        return "Hello Boat ";
    }
}
