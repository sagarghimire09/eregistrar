package com.sagar.eRegistrar.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sagar.eRegistrar.model.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Integer> {

}