package mum.fpp.fm.impl;

import mum.fpp.fm.dao.FitnessRecord;
import mum.fpp.fm.inter.AbstractFitnessMonitor;

public class RunningMonitor extends AbstractFitnessMonitor {

	private int distance;
	private FitnessRecord record;
	
	public RunningMonitor() {
		super();
		this.record = super.getRecord();
	}
	

	public void setDistance(int distance) {
		this.distance = distance;
	}

	/*
	 * hours*calorieByHour (calorieByHour has three levels: 600, 400, 200)
	 * @see mum.fpp.fm.inter.FitnessMonitor#computeCalorie()
	 */
	@Override
	protected void setCalorieByHour(){
		double aveSpeed = distance/record.getHours();
		if(aveSpeed > 10)
			setCalorieByHour(600);
		if(aveSpeed > 3 && aveSpeed < 6)
			setCalorieByHour(400);
		if(aveSpeed < 3)
			setCalorieByHour(200);
	}
	

}
