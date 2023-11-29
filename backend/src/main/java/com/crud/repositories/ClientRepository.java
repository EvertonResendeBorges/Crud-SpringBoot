package com.crud.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crud.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long>{

}
