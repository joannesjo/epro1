package com.example.epro.Repository;

import com.example.epro.entity.FamilyDetailsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FamilyDetailsRepository  extends JpaRepository<FamilyDetailsEntity, Integer> {
}
