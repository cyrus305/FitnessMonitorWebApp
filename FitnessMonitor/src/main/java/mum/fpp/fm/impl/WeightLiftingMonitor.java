package mum.fpp.fm.impl;

import mum.fpp.fm.dao.FitnessRecord;
import mum.fpp.fm.inter.AbstractFitnessMonitor;

public class WeightLiftingMonitor extends AbstractFitnessMonitor{
	
	private double load;
	private FitnessRecord record;
	
	public WeightLiftingMonitor() {
		super();
		this.record = super.getRecord();
	}
	
	public void setLoad(double load){
		this.load = load;
	}
	
	
	/*
	 * hours*calorieByHour (calorieByHour has three levels: 1000, 600, 300)
	 * @see mum.fpp.fm.inter.FitnessMonitor#computeCalorie()
	 */
	@Override
	protected void setCalorieByHour(){
		double aveLoad = load/record.getHours();
		if(aveLoad > 15)
			setCalorieByHour(1000);
		if(aveLoad > 10 && aveLoad < 15)
			setCalorieByHour(600);
		if(aveLoad < 5)
			setCalorieByHour(300);
	}
	


}
