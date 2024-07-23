package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entities.enums.WorkerLevel;

public class Worker {
	// COMPOSIÇÃO DE OBJETOS

	// ATRIBUTOS BASICOS
	private String name;
	private WorkerLevel level;
	private Double baseSalary;

	// ASSOCIAÇÕES
	private Department department; // atributo letra minuscula
	private List<HourContracts> contracts = new ArrayList<>();// TEM MUITOS - NÃO INCLUI NO argumentos do CONTRUTOR,
																// APENAS INICIA LISTA

	// CONTRUTOR VAZIO
	public Worker() {
	}

	//CONTRUTOR + ARUGMENTOS
	public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.department = department;
	}
	
	//SETER E GETERS
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public WorkerLevel getWorkerLevel() {
		return level; 
	}
	public void setWorkerLevel(WorkerLevel level) {
		this.level = level;
	}
	public Double getBaseSalary() {
		return baseSalary;
	}
	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}
	
	
	
	
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	
	public List<HourContracts> getContracts(){
		return contracts;
	}
	
	//Fazer  e desfazer a associação do contrato com o trablahador
	//METODO ADIÇÃO
	public void addContract(HourContracts contract) {
		contracts.add(contract);
	}
	//METODO REMOÇÃO
	public void removeContract(HourContracts contract) {
		contracts.remove(contract);
	}
	
	
	
	//Operação para ver quanto o funcionario ganha , ano e mes
	public double income(int year, int month) {
		double soma =  baseSalary;
		
		Calendar cal = Calendar.getInstance();
		
		for(HourContracts a : contracts ) { //contrato A na lista de contatos
			cal.setTime(a.getDate());
			int a_year = cal.get(Calendar.YEAR);
			int a_month = 1 + cal.get(Calendar.MONTH); //calendario começa em 0
			if(year == a_year && month == a_month) {
				soma = soma + a.totalValue();
			}
		}
		return soma;
	}

}
