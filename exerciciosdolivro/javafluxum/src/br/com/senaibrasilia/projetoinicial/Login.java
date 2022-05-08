package br.com.senaibrasilia.projetoinicial;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.HeadlessException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends JFrame  {

	private JButton btnLogar;
	private FlowLayout layout;
	private Container container;
	private JLabel lblusername, lblPassword;
	private JTextField tfUsername;
	private JPasswordField pfPassword;
	private int cont = 0;
	String usuario = "senaibrasilia",usuario1="",senha1="";
	String senha = "senai";

	public Login() {
	   
		super("SENAI-BRASÍLIA JAVA");
		layout = new FlowLayout();
		
		// criação campotexto
		JTextField tfUsername = new JTextField(20);
		pfPassword = new JPasswordField(8);
		// criação label usuario e senha
		lblusername = new JLabel("Usuário\n");
		lblusername.setToolTipText("Digite o nome do usuário");
		setTfUsername(tfUsername);// seta a variável nome
		lblPassword = new JLabel("Senha");
		lblPassword.setToolTipText("Digite a senha");
		
		setPfPassword(pfPassword);// set a variável senha
		btnLogar = new JButton("Logar");
		// Registra o listener para ações no botão
		btnLogar.setLayout(new BorderLayout(20, 40));
		add(btnLogar);
		add(lblusername);
		add(tfUsername);
		add(lblPassword);
		add(pfPassword);
		setLayout(layout);
		//btnLogar.addActionListener(this);
		setSize(800, 600);

	}

	public Login(JTextField tfUsername, JPasswordField pfPassword) throws HeadlessException {
		super();
		this.tfUsername = tfUsername;
		this.pfPassword = pfPassword;
	}

	public JTextField getTfUsername() {
		return tfUsername;
	}

	public void setTfUsername(JTextField tfUsername) {
		this.tfUsername = tfUsername;

	}

	public JPasswordField getPfPassword() {
		return pfPassword;
	}

	public void setPfPassword(JPasswordField pfPassword) {
		this.pfPassword = pfPassword;

	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public int getCont() {
		return cont;
	}

	public void setI(int i) {
		this.cont = i;
	}

	

 public void actionPerformed(ActionEvent e) { 
	 
  usuario1 = getTfUsername().getText(); 
  senha1 =getPfPassword().getText(); 
	 
if (cont<3) {

if (usuario1.equals(getUsuario()) && senha1.equals(getSenha())) {

JOptionPane.showMessageDialog(null, "Acesso");

} else if (usuario1 != getTfUsername().getText() || senha1 !=
getPfPassword().getText()) {
	JOptionPane.showMessageDialog(null,
			"Usuário ou senha incorretos");
}
}else if(cont>2) { JOptionPane.showMessageDialog(null,
"Usuário bloqueado procure sua agência");

dispose();
System.exit(0); 

} 

cont++; 
}

}

	 
 
 
