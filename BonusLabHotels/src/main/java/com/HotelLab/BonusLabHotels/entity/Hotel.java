package com.HotelLab.BonusLabHotels.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "hotel_listing")
public class Hotel {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "hotel_id")
	private long id;
	@Column(name = "hotel_name")
	private String name;
	@Column(name = "city")
	private String city;
	@Column(name = "price_per_night")
	private String pricePerNight;

	
	public Hotel() {
		super();
	}

	public Hotel(long id, String name, String city, String pricePerNight) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.pricePerNight = pricePerNight;
	}

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the pricePerNight
	 */
	public String getPricePerNight() {
		return pricePerNight;
	}

	/**
	 * @param pricePerNight the pricePerNight to set
	 */
	public void setPricePerNight(String pricePerNight) {
		this.pricePerNight = pricePerNight;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "id: " + id + ", name: " + name + ", city: " + city + ", price per night: " + pricePerNight;
	}
	
	
	
	
	
}

