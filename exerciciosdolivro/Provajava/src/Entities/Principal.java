package Entities;
import javax.swing.JOptionPane;
public class Principal {

	public static void main(String[] args) {
		
		TrabalhadorChefe TrabCh = new TrabalhadorChefe("jose Andre ", "Moura",1200);
		TrabalhadorComissao TrabCom =new TrabalhadorComissao ("Paulo","Dasilva",1200,
				1.05,120);
		TrabalhadorProducao  TrabProd = new TrabalhadorProducao ("Jonas","Limeira",12,100);
		
		TrabalhadorHorista TrabHor = new TrabalhadorHorista("Marisa","Belmonte da silva",
				17.98 ,200);
		
		
		JOptionPane.showMessageDialog(null,"\t\tRelatorio \n\nfunção   "
				+ "\tnome\t \bsalário  \n"+TrabCh.toString()+"\n"+
				 TrabProd.toString()+"\n"+TrabHor.toString()+"\n"+TrabCom.toString());
		
		
	}

}
