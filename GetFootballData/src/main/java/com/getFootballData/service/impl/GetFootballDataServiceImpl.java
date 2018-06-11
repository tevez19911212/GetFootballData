package com.getFootballData.service.impl;

import java.util.Collections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
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
	 //private static final String URL = "http://api.football-data.org/v1/competitions/426";

	@Override
	public TeamsFixturesDto getMatchresults() {
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
		headers.add("X-Auth-Token", "1dde910ad0124a61bd52f1f8d4032db4");
		HttpEntity<String> entity = new HttpEntity<>("parameters", headers);
		 //return restTemplate.postForObject(URL,  entity, MatchresultsDto.class);
		 return restTemplate.getForObject(URL,  TeamsFixturesDto.class);
	}

}
