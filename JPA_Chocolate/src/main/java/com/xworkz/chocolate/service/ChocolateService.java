package com.xworkz.chocolate.service;


import java.util.List;

import org.springframework.ui.Model;

import com.xworkz.chocolate.dto.ChocolateDTO;

public interface ChocolateService {
	public boolean validateAndSave(ChocolateDTO dto, Model model);

	public ChocolateDTO findById(int id);

	public List<ChocolateDTO> readAll();
	
	public ChocolateDTO findByName(String name,Model model);

	public boolean isExists(String name);

	public boolean updateQuantityByName(int quantity, String name);
	
	public boolean deleteByName(String name);
	

	
}
