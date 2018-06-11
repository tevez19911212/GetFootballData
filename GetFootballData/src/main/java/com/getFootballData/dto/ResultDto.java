package com.getFootballData.dto;

public class ResultDto {
	private String goalsHomeTeam;
	private String goalsAwayTeam;
	private ResultDto halfTime;

	public String getGoalsHomeTeam() {
		return goalsHomeTeam;
	}
	public void setGoalsHomeTeam(String goalsHomeTeam) {
		this.goalsHomeTeam = goalsHomeTeam;
	}
	public String getGoalsAwayTeam() {
		return goalsAwayTeam;
	}
	public void setGoalsAwayTeam(String goalsAwayTeam) {
		this.goalsAwayTeam = goalsAwayTeam;
	}
	public ResultDto getHalfTime() {
		return halfTime;
	}
	public void setHalfTime(ResultDto halfTime) {
		this.halfTime = halfTime;
	}
}
