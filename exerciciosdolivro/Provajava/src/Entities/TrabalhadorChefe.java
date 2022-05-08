package Entities;

import br.com.senai.prova.ICalcSalario;

public class TrabalhadorChefe extends Trabalhador implements ICalcSalario {
private double salario_semanal;



	public TrabalhadorChefe(String nome, String sobrenome,double Sal_semanal) {
		super(nome, sobrenome);
		this.setSalario_semanal(Sal_semanal);
		this.calcSAL();
	}



	public double getSalario_semanal() {
		return salario_semanal;
	}



	public void setSalario_semanal(double salario_semanal) {
		this.salario_semanal = salario_semanal;
	}



	@Override
	public String toString() {
		
		return "Chefe "+this.getNome()+this.getSalario();
				
	
	}



	@Override
	public void calcSAL() {
		this.setSalario(salario_semanal*4); 
		
	}
	
	

}
