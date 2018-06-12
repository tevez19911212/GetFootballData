package com.getFootballData.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.getFootballData.dto.TeamsFixturesDto;
import com.getFootballData.service.GetFootballDataService;

@Service
public class GetFootballDataServiceImpl implements GetFootballDataService {

	 @Autowired
	 @Qualifier("getFootballDataServiceRestTemplate")
	 RestTemplate restTemplate;

	 private static final String URL = "http://api.football-data.org/v1/teams/65/fixtures";

	@Override
	public TeamsFixturesDto getMatchresults() {
		 return restTemplate.getForObject(URL,  TeamsFixturesDto.class);
	}

}
