package com.xworkz.chocolate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;

import com.xworkz.chocolate.dto.ChocolateDTO;
import com.xworkz.chocolate.repo.ChocolateRepo;

@Component
public class ChocolateServiceImpl implements ChocolateService {

	@Autowired
	private ChocolateRepo repo;

	@Override
	public boolean validateAndSave(ChocolateDTO dto, Model model) {
		if (dto.getName() != null && !dto.getName().isEmpty()) {
			if (dto.getPrice() > 0) {
				if (dto.getQuantity() > 0) {
					if (dto.getManufacturer().length() > 3) {
						boolean exists = isExists(dto.getName());
						if (!exists) {
							System.out.println("Chocolate Exists");
							return repo.save(dto);
						}else {
							model.addAttribute("isExists", "Chocolate already Exists");
							return false;
						}

					}

				}
			}
		}
		return false;
	}

	@Override
	public ChocolateDTO findById(int id) {
		if (id > 0) {
			return repo.findById(id);
		}
		return null;
	}

	@Override
	public List<ChocolateDTO> readAll() {
		return repo.readAll();
	}

	@Override
	public ChocolateDTO findByName(String name, Model model) {
		if (name != null && !name.isEmpty() && name.length() > 3) {
			ChocolateDTO dto = repo.findByName(name);
			if (dto == null) {
				model.addAttribute("nameNotFound", "Chocolate not found");
				return dto;
			}
			return dto;
		}
		model.addAttribute("nameNotValid", "Name is not valid");
		return null;

	}

	@Override
	public boolean isExists(String name) {
		if (name != null && !name.isEmpty()) {
			ChocolateDTO dto = repo.findByName(name);
			if (dto != null) {
				System.out.println("Chocolate Exists");
				return true;
			}return false;
		}
		return false;
	}

	@Override
	public boolean updateQuantityByName(int quantity, String name) {
		if(quantity>0 && name!=null && !name.isEmpty()) {
			return repo.updateQuantityByName(quantity, name);
		}
		return false;
	
	}

	@Override
	public boolean deleteByName(String name) {
		if(name!=null && !name.isEmpty()) {
			return repo.deleteByName(name);
		}
		return false;
	}

}
