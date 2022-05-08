package Entities;

import br.com.senai.prova.ICalcSalario;

public class TrabalhadorComissao extends Trabalhador implements ICalcSalario {
        private double comissao;
	    private double vlttotal_itens;
	
	
	public TrabalhadorComissao(String nome, String sobrenome,double salario,double
			comissao,double vlttotal_itens) {
		super(nome, sobrenome);
		this.setComissao(comissao);
		this.setVlttotal_itens(vlttotal_itens);
		this.calcSAL();
		
	}

	
	
	
	public double getComissao() {
		return comissao;
	}




	public void setComissao(double comissao) {
		this.comissao = comissao;
	}




	public double getVlttotal_itens() {
		return vlttotal_itens;
	}




	public void setVlttotal_itens(double vlttotal_itens) {
		this.vlttotal_itens = vlttotal_itens;
	}




	@Override
	public void calcSAL() {
		this.setSalario(comissao*vlttotal_itens);
		
	}




	@Override
	public String toString() {
		  
		
		return "Trabalhador por Comissao "+this.getNome()+" "+this.getSalario();
	}
	
	
	

}
