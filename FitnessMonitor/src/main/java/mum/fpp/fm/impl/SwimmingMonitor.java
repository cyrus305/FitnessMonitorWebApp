package mum.fpp.fm.impl;

import mum.fpp.fm.dao.FitnessRecord;
import mum.fpp.fm.inter.AbstractFitnessMonitor;

public class SwimmingMonitor extends AbstractFitnessMonitor{
	
	private int laps;
	private FitnessRecord record;

	public SwimmingMonitor() {
		super();
		this.record = super.getRecord();
	}

	
	public void setLaps(int laps) {
		this.laps = laps;
	}


	/*
	 * hours*calorieByHour (calorieByHour has three levels: 800, 500, 300)
	 * @see mum.fpp.fm.inter.FitnessMonitor#computeCalorie()
	 */
	protected void setCalorieByHour(){
		double aveSpeed = 200*laps/record.getHours();
		if(aveSpeed > 60)
			setCalorieByHour(800);
		if(aveSpeed > 30 && aveSpeed < 60)
			setCalorieByHour(500);
		if(aveSpeed < 30)
			setCalorieByHour(300);
	}


}
