package com.cognizant.truyum.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cognizant.truyum.model.MenuItem;

@Repository
public interface MenuItemRepository extends JpaRepository<MenuItem, Long> {
	
	@Query(value="select * from menuitem where active=true and  date_of_launch<='2021-12-18' ", nativeQuery = true)
	public List<MenuItem> findByActiveDateOfLaunchLessThan();

}
