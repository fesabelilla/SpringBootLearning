package com.example.main.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.main.Model.Programmer;

@Repository
public interface ProgrammerRepo extends JpaRepository<Programmer, Integer> {

	@Query("from Programmer where pLang = ?1")
	List<Programmer> findP(String pLang);

}
