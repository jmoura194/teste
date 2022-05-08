package Entities;

public abstract class Trabalhador {
	
	private String nome;
	private String sobrenome;
	private double salario=0;
	
	
	public Trabalhador(String nome, String sobrenome) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
	}
	
	
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
	public String toString() {
		
		return this.nome+""+this.sobrenome;
		
		
	}
	
	
	/*public String toString(String nome) {//e retorna o nome e o sobrenome separados por um espaço.
	    nome.trim(); //retira espaços no início e final
		String partes[];
	    int nrpartes=0;
	    partes= nome.split(" ");//formar um vetor de partes do nome sem expaço
	    for (int i=1 ;i<=partes.length-1;i++) {
	    sobrenome+=partes[i];//sobrenome sem espacos
	   
	    }
	    
	    return partes[0]+" "+sobrenome;
	}*/
	

}
