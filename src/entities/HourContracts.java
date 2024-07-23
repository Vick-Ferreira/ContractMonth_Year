package entities;

import java.util.Date;


public class HourContracts {
	//atributos objeto
	private Date date;
	private Double valuePerHour;
	private Integer hours;
	
	
	//contrutor vazio
	public HourContracts() {
		
	}
	//contrutor + argumentos
	public HourContracts(Date date, Double valuePerHour, Integer hours) {
		this.date = date;
		this.valuePerHour = valuePerHour;
		this.hours = hours;
	}
	//geter e seter
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Double getValuePerHours() {
		return valuePerHour;
	}
	public void setValuePerHours(Double valuePerHour) {
		this.valuePerHour = valuePerHour;
	}
	public Integer getHours() {
		return hours;
	}
	public void setHours(Integer hours) {
		this.hours = hours;
	}
	
	//DELEGAÇÃO 
	public double totalValue() {
		return valuePerHour * hours;
	}
	

}
