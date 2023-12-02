package com.xworkz.chocolate.repo;

import java.util.List;

import org.springframework.stereotype.Component;

import com.xworkz.chocolate.dto.ChocolateDTO;

@Component
public interface ChocolateRepo {

	public boolean save(ChocolateDTO dto);

	public ChocolateDTO findById(int id);

	public List<ChocolateDTO> readAll();

	public ChocolateDTO findByName(String name);

	public boolean updateQuantityByName(int quantity, String name);
	
	public boolean deleteByName(String name);

}
