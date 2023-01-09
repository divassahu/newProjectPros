package com.prospecta.respository;

import org.springframework.data.jpa.repository.JpaRepository; 
import org.springframework.stereotype.Repository;

import com.prospecta.model.EntryDB;

@Repository
public interface EntryRepository extends JpaRepository<EntryDB, Integer> {

}
