package com.HotelLab.BonusLabHotels;

import java.util.List;
import java.util.TreeSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.HotelLab.BonusLabHotels.dao.HotelRepository;
import com.HotelLab.BonusLabHotels.entity.Hotel;

@Controller
public class HotelController {

	@Autowired
	HotelRepository hotelDao;
	
	@RequestMapping("/")
	public ModelAndView home() {
		TreeSet<String> citiesList = hotelDao.findDistinctCities();
		System.out.println(citiesList.toString());
		return new ModelAndView("index", "cities", citiesList);
	}
	
//	@PostMapping("/test/{city}")
//	public ModelAndView submitEditForm (@PathVariable("city") String city) {
//		List<Hotel> hotelsList = hotelDao.findByCity(city);
//		System.out.println(hotelsList);
//		
//		return new ModelAndView("hotel_list", "hotels", hotelsList);
//	}
	
	@RequestMapping("/results")
	public ModelAndView hotelMv(@RequestParam("city") String city) {
		List<Hotel> hotelsList = hotelDao.findByCity(city);
		System.out.println(hotelsList);
		
		return new ModelAndView("hotel_list", "hotels", hotelsList);
	}
	
}
