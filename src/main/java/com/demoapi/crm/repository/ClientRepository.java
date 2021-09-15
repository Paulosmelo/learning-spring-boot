package com.demoapi.crm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demoapi.crm.model.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

}
