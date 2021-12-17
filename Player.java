package com.beans;

public class Player {
	private String name;
	private String skill;
	private String country;
	private double avgScore;
	

	public Player(String name,double avgScore) {

		this.avgScore = avgScore;
		this.name = name;
	}
	public Player(String name, String skill) {

		this.name = name;
		this.skill = skill;
	}

	public Player(String name, String skill, String country) {

	this.name = name;
	this.skill = skill;
	this.country = country;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public double getAvgScore() {
		return avgScore;
	}
	public void setAvgScore(double avgScore) {
		this.avgScore = avgScore;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Player [name=");
		builder.append(name);
		builder.append(", skill=");
		builder.append(skill);
		builder.append(", country=");
		builder.append(country);
		builder.append(", avgScore=");
		builder.append(avgScore);
		builder.append("]");
		return builder.toString();
	}

	

}
