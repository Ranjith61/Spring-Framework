package com.xworkz.chocolate.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.chocolate.dto.ChocolateDTO;
import com.xworkz.chocolate.service.ChocolateService;

@Controller
@RequestMapping("/chocolate")
public class ChocolateController {

	@Autowired
	private ChocolateService service;

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String save(ChocolateDTO dto, Model model) {
		boolean saved = service.validateAndSave(dto, model);
		if (saved) {
			return "Success";
		}

		return "Chocolate";
	}

	@RequestMapping(value = "/find", method = RequestMethod.GET)
	public String findById(@RequestParam int id, Model model) {

		ChocolateDTO result = service.findById(id);
		if (result != null) {
			model.addAttribute("dto", result);
			return "Success";
		}
		return "Chocolate";

	}

	@RequestMapping(value = "/read", method = RequestMethod.GET)
	public String readAll(Model model) {
		List<ChocolateDTO> list = service.readAll();
		if (list != null && !list.isEmpty()) {
			model.addAttribute("list", list);
			return "Read";
		} else {
			model.addAttribute("NotFound", "DTO not found");
			return "Chocolate";
		}
	}

	@RequestMapping(value = "/findByName", method = RequestMethod.GET)
	public String findByName(@RequestParam String name, Model model) {

		ChocolateDTO found = service.findByName(name, model);
		if (found != null) {
			model.addAttribute("dto", found);
			return "Find";
		} else {
			model.addAttribute("NameNotFound", "Name is not found");
		}
		return "Chocolate";

	}
	

	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String updateQuantityByName(@RequestParam int quantity, @RequestParam String name, Model model) {
		boolean isUpdated = service.updateQuantityByName(quantity, name);
		if (isUpdated) {
			model.addAttribute("isUpdated", "Quantity Updated");
			return "Chocolate";
		} else {
			model.addAttribute("isUpdated", "Quantity Not Updated");
			return "Chocolate";
		}
	}
		@RequestMapping(value = "/delete", method = RequestMethod.POST)
		public String deleteByName(@RequestParam String name, Model model) {
			boolean isUpdated = service.deleteByName(name);
			if (isUpdated) {
				model.addAttribute("isDeleted", "Chocolate Deleted");
				return "Chocolate";
			} else {
				model.addAttribute("isDeleted", "Chocolate Not Deleted");
				return "Chocolate";
			}
		

	}
}
