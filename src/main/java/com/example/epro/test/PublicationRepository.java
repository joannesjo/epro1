package com.example.epro.test;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PublicationRepository extends JpaRepository<PublicationBean, Integer> {
}
