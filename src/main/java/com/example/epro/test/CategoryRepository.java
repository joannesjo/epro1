package com.example.epro.test;

import com.example.epro.entity.PartnerPreferenceEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<PersonForm, Integer> {
}
