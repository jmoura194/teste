package Entities;

import br.com.senai.prova.ICalcSalario;

public class TrabalhadorHorista extends Trabalhador implements ICalcSalario {

	private double valorporhora=0;
	private int qts_horas_trab=0;
	
	
	public TrabalhadorHorista(String nome, String sobrenome,double valorporhora,
			int qts_horas_trab) {
		super(nome, sobrenome);
		this.setQts_horas_trab(qts_horas_trab);
		this.setValorporhora(valorporhora);
		this.calcSAL();
		
		
	}

	
	public double getValorporhora() {
		return valorporhora;
	}


	public void setValorporhora(double valorporhora) {
		this.valorporhora = valorporhora;
	}


	public int getQts_horas_trab() {
		return qts_horas_trab;
	}


	public void setQts_horas_trab(int qts_horas_trab) {
		this.qts_horas_trab = qts_horas_trab;
	}


	@Override
	public void calcSAL() {
		this.setSalario(this.getValorporhora()*this.getQts_horas_trab());
		
		
	}


	@Override
	public String toString() {
		
		return "Trabalhador Horista  " + this.getNome()+" "+this.getSalario();
	}
	
	
	
	
	
	
	
	

}
