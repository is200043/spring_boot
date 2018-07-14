/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.dao;

import com.example.demo.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 *
 * @author boatc
 */
@Repository
public class StudentRepo {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public Student findById(long id) {
        return jdbcTemplate.queryForObject("select * from student where id=?", new Object[]{id}, new BeanPropertyRowMapper< Student>(Student.class));
    }

}
