package br.com.senaibrasilia.projetoinicial;

import javax.swing.JFrame;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Testando o terminal java ..Vamos abrir"
				+ "um JFrame" );
		Login l = new Login();
		l.setVisible(true);
		l.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		

	}

}
