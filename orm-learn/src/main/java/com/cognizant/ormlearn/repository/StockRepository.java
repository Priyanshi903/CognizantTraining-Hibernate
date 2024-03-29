package com.cognizant.ormlearn.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cognizant.ormlearn.model.Stock;

@Repository
public interface StockRepository extends JpaRepository<Stock, Integer> {
	
	public List<Stock> findByCloseGreaterThan(double value);
	
	public List<Stock> findTop3ByCodeOrderByCloseAsc(String code);
	
	@Query("select e from Stock e where year(e.date) = ?1 and month(e.date) = ?2 and e.code = ?3")
	List<Stock> getByYearAndMonthAndCode(int year, int month,String code);
	
	public List<Stock> findTop3ByOrderByVolumeDesc();



}
