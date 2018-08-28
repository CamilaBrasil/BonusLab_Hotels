package com.HotelLab.BonusLabHotels.dao;

import java.util.List;
import java.util.TreeSet;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.HotelLab.BonusLabHotels.entity.Hotel;


public interface HotelRepository extends JpaRepository<Hotel, Long>{

	@Query("SELECT DISTINCT city FROM Hotel")
	TreeSet<String> findDistinctCities();
	
	List<Hotel> findByCity(String city);
	
	
}
