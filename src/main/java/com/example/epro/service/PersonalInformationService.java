package com.example.epro.service;

import com.example.epro.model.PersonalInformation;

import java.util.List;

public interface PersonalInformationService {
    PersonalInformation createPersonalInformation(PersonalInformation personalInformation);
    PersonalInformation getPersonalInformation(Integer personId);
    PersonalInformation editPersonalInformation(PersonalInformation personalInformation);
    void deletePersonalInformation(PersonalInformation personalInformation);
    void deletePersonalInformation(Integer id);
    List getAllPersonalInformation(Integer pageNumber, Integer pageSize);
    List getAllPersonalInformation();
    long countPersonalInformation();
}
