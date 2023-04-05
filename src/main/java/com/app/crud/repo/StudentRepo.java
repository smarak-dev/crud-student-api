package com.app.crud.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.crud.entity.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {

}