package com.example.epro.Repository;

import com.example.epro.model.PersonalInformation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonalInformationRepository  extends JpaRepository<PersonalInformation, Integer> {
}
