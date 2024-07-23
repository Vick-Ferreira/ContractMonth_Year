package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;


import entities.Department;
import entities.HourContracts;
import entities.Worker;
import entities.enums.WorkerLevel;

public class Program {

	public static void main(String[] args) throws ParseException { //ParseException ecessão
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		SimpleDateFormat  sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Enter department's name: ");
		String departmentName = sc.nextLine();
		System.out.println("Enter worker data: ");
		
		System.out.print("Nome: ");
		String workerName = sc.nextLine();
		System.out.print("Level: ");
		String workerLevel = sc.nextLine();
		System.out.print("Base salary: ");
		double baseSalary = sc.nextDouble();
		
		
		//instaciar novo obj to tipo WORKER, dados desse obj são os dados digitados pelo user, associado a isso tem outro obj que é o departamento que recebe o nome 
		Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Department(departmentName));
		
		
		System.out.print("How many contracts to this worker?"); //quantidade de contratos
		int n = sc.nextInt();
		for(int i=1; i<=n; i++) {
			System.out.println("Enter contract #" + i + "data:");
			System.out.print("Data (DD/MM/YYYY): ");
			Date contractDate = sdf.parse(sc.next());
			System.out.print("Value per hours");
			double valuePerHours = sc.nextDouble();
			System.out.print("Duration (hours): ");
			int hours = sc.nextInt();
			
			HourContracts contracts = new HourContracts(contractDate, valuePerHours, hours);
			worker.addContract(contracts);
		}
		
		System.out.println();
		System.out.print("Enter month and year to calculate income (MM/YYYY)");
		String monthAndYear =sc.next();
		
		//RECORTE STRING  e CONVERTE PARA INTEIRO
		int month = Integer.parseInt( monthAndYear.substring(0, 2)); //cria uma subString
		int year = Integer.parseInt(monthAndYear.substring(3));
		System.out.println("Name: " + worker.getName());
		System.out.println("Department: " + worker.getDepartment().getName());
		System.out.println("Income for " + monthAndYear + ":" + String.format("%.2f" , worker.income(year, month)));
		
		
		
		sc.close();

	}

}
