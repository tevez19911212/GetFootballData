package com.getFootballData.dto;

import java.util.List;

public class TeamsFixturesDto {
	private String season;

	private Integer count;

	private List<MatchresultsDto> fixtures;
	//private MatchresultsDto[] fixtures;

	//private String fixtures;

	public String getSeason() {
		return season;
	}

	public void setSeason(String season) {
		this.season = season;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	/*public MatchresultsDto[] getFixtures() {
		return fixtures;
	}

	public void setFixtures(MatchresultsDto[] fixtures) {
		this.fixtures = fixtures;
	}*/

	public List<MatchresultsDto> getFixtures() {
		return fixtures;
	}

	public void setFixtures(List<MatchresultsDto> fixtures) {
		this.fixtures = fixtures;
	}
}
