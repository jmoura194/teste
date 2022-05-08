package br.com.senaibrasilia.projetoinicial;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.HeadlessException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends JFrame implements ActionListener {

	private JButton btnLogar;
	private FlowLayout layout;
	private Container container;
	private JLabel lblusername, lblPassword;
	private JTextField tfUsername;
	private JPasswordField pfPassword;
	private int cont = 0;
	String usuario = "senaibrasilia", senha = "senai", senha1 = "", usuario1 = "";

	public Login() {
		super("SENAI-BRAS�LIA JAVA");
		layout = new FlowLayout();
		container = new Container();
		JTextField tfUsername = new JTextField(20);
		JTextField tfPassword = new JTextField(8);
		lblusername = new JLabel("Usu�rio\n");
		lblusername.setToolTipText("Digite o nome do usu�rio");
		setTfUsername(tfUsername);
		lblPassword = new JLabel("Senha");
		lblPassword.setToolTipText("Digite a senha");
		pfPassword = new JPasswordField(8);
		setPfPassword(pfPassword);
		setUsuario(usuario);
		setSenha(senha);
		btnLogar = new JButton("Logar");
		add(btnLogar);
		add(lblusername);
		add(tfUsername);
		add(lblPassword);
		// add(tfPassword);
		add(pfPassword);
		setLayout(layout);
		btnLogar.addActionListener(this);
		setSize(800, 600);

	}

	private char[] getpfsenha() {
		// TODO Auto-generated method stub
		return null;
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

	public Login(JTextField tfUsername, JPasswordField pfPassword) throws HeadlessException {
		super();
		this.tfUsername = tfUsername;
		this.pfPassword = pfPassword;
	}

	public void actionPerformed(ActionEvent e) {
		usuario1 = getTfUsername().getText();
		senha1 = new String(getPfPassword().getText());

		if (cont < 3) {
			if (usuario1.equals(getUsuario()) && senha1.equals(getSenha())) {
				JOptionPane.showMessageDialog(null, "logado");
			} else if (usuario1 != getUsuario() || senha1 != getSenha()) {
				JOptionPane.showMessageDialog(null, "Usu�rio ou senha inv�lidos");

			}

			cont++;
		} else {
			JOptionPane.showMessageDialog(null, "Procure sua ag�ncia");
			
			System.exit(0);
		}

	}

}
