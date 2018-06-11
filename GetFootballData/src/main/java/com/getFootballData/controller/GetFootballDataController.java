package com.getFootballData.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.getFootballData.dto.TeamsFixturesDto;
import com.getFootballData.service.GetFootballDataService;

@Controller
public class GetFootballDataController {

	@Autowired
	private GetFootballDataService service;

	@RequestMapping("/")
	public String index(Model model) {
		TeamsFixturesDto dto = service.getMatchresults();
		model.addAttribute("TeamsFixturesDto", dto);
		return "index";
	}
}
