package com.example.epro.Repository;

import com.example.epro.model.FamilyDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FamilyDetailsRepository  extends JpaRepository<FamilyDetails, Integer> {
}
