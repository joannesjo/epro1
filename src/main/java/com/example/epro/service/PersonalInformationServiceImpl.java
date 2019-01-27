package com.example.epro.service;

import com.example.epro.Repository.PersonalInformationRepository;
import com.example.epro.model.PersonalInformation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PersonalInformationServiceImpl implements PersonalInformationService {

    @Autowired
    PersonalInformationRepository personalInformationRepository;

    @Override
    public PersonalInformation createPersonalInformation(PersonalInformation personalInformation) {
        return personalInformationRepository.save(personalInformation);
    }

    @Override
    public PersonalInformation getPersonalInformation(Integer personId) {
        return personalInformationRepository.getOne(personId);
    }

    @Override
    public PersonalInformation editPersonalInformation(PersonalInformation personalInformation) {
        return personalInformationRepository.save(personalInformation);
    }

    @Override
    public void deletePersonalInformation(PersonalInformation personalInformation) {
        personalInformationRepository.delete(personalInformation);
    }

    @Override
    public void deletePersonalInformation(Integer id) {
        personalInformationRepository.deleteById(id);
    }

    @Override
    public List getAllPersonalInformation(Integer pageNumber, Integer pageSize) {
        return personalInformationRepository.findAll(new PageRequest(pageNumber, pageSize)).getContent();
    }

    @Override
    public List getAllPersonalInformation() {
        return personalInformationRepository.findAll();
    }

    @Override
    public long countPersonalInformation() {
        return personalInformationRepository.count();
    }
}
