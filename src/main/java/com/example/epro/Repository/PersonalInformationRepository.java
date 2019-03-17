package com.example.epro.Repository;

import com.example.epro.entity.PersonalDetailsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonalInformationRepository  extends JpaRepository<PersonalDetailsEntity, Integer> {
}
