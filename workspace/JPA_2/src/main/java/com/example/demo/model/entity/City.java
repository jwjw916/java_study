package com.example.demo.model.entity;

import com.example.demo.model.dto.CityDto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class City {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(columnDefinition = "char(3) NOT NULL DEFAULT")
	private String name;
	@Column(columnDefinition = "char(20) NOT NULL DEFAULT")
	private String district;
	private long population;
	
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="countrycode")
	private Country countrycode;
	
	
	public CityDto toDto() {
		CityDto dto = new CityDto();
		dto.setId(this.getId());
		dto.setName(this.getName());
		dto.setDistrict(this.getDistrict());
		dto.setPopulation(this.getPopulation());
		dto.setCountrycode(this.getCountrycode().getCode());
		return dto;
	}
	
}
