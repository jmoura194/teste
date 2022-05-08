package Entities;

import br.com.senai.prova.ICalcSalario;

public class TrabalhadorProducao extends Trabalhador implements ICalcSalario {
	
	private double 	valor_itenprod=0;
	private int qtd_intens_prod=0;

	public TrabalhadorProducao(String nome, String sobrenome, double
			valor_itenprod ,int qtd_intens_prod) {
		super(nome, sobrenome);
	    this.setQtd_intens_prod(qtd_intens_prod);
	    this.setValor_itenprod(valor_itenprod);
	    this.calcSAL();
	
	}
	

	public double getValor_itenprod() {
		return valor_itenprod;
	}


	public void setValor_itenprod(double valor_itenprod) {
		this.valor_itenprod = valor_itenprod;
	}


	public int getQtd_intens_prod() {
		return qtd_intens_prod;
	}


	public void setQtd_intens_prod(int qtd_intens_prod) {
		this.qtd_intens_prod = qtd_intens_prod;
	}


	@Override
	public void calcSAL() {
		this.setSalario(this.getValor_itenprod()*this.getQtd_intens_prod());
		
	}


	@Override
	public String toString() {
		
		return "Trabalhador por produção "+this.getNome()+" "+this.getSalario();
	}
	
	

}
