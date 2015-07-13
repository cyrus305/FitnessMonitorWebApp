package mum.fpp.fm.inter;

import mum.fpp.fm.dao.FitnessRecord;
import mum.fpp.fm.dao.RecordDAO;

public abstract class AbstractFitnessMonitor implements FitnessMonitor {

	private int calorieByHour;
	private RecordDAO recordDao;
	private FitnessRecord record;

	public AbstractFitnessMonitor() {
		super();
		record = new FitnessRecord();
		recordDao = new RecordDAO();		
	}
	
	protected FitnessRecord getRecord(){
		return record;
	}

	protected int getCalorieByHour() {
		return calorieByHour;
	}

	protected void setCalorieByHour(int calorieByHour) {
		this.calorieByHour = calorieByHour;
	}
	
	protected void setWeight(double weight){
		record.setWeight(weight);
	}
	
	protected void setHours(double hours){
		record.setHours(hours);
	}
	
	protected void submitRecord(FitnessRecord record){
		recordDao.saveRecord(record);
	}
	
	public void computeCalorie() {
		setCalorieByHour();
		int ebc = (int)(getCalorieByHour()*record.getHours());
		record.setCalories(ebc);
	}

	protected void setCalorieByHour() {
		// TODO Auto-generated method stub
		
	}




	

}
