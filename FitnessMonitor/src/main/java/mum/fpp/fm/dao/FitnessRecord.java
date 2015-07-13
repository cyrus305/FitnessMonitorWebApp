package mum.fpp.fm.dao;

import java.time.LocalDate;

public class FitnessRecord {
	
	
	private double weight;
	private int calories;
	private LocalDate exdate;
	private double hours;
	
	public LocalDate getExdate() {
		return exdate;
	}
	public void setExdate(String exdate) {
		this.exdate = LocalDate.parse(exdate);
	}
	public double getHours() {
		return hours;
	}
	public void setHours(double hours) {
		this.hours = hours;
	}

	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public int getCalories() {
		return calories;
	}
	public void setCalories(int calories) {
		this.calories = calories;
	}
	
	@Override
	public String toString() {
		return "FitnessRecord [weight=" + weight + ", calories=" + calories + ", exdate=" + exdate + "]";
	}
	
	
	
	
}
