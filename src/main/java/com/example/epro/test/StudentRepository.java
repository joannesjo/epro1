package com.example.epro.test;

import com.example.epro.entity.EducationDetailsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

    public interface StudentRepository extends JpaRepository<Student, Integer> {
}
