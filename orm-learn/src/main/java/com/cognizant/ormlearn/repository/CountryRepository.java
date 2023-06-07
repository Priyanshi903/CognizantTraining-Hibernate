package com.cognizant.ormlearn.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cognizant.ormlearn.model.Country;

//<Country,String>.....String is the data type of id
@Repository
public interface CountryRepository extends JpaRepository<Country, String> {
	
	public List<Country> findByNameContainingOrderByNameAsc(String search);

}
