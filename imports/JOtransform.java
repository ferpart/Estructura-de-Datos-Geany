package imports;

import javax.swing.JOptionPane;

public class JOtransform<E> implements JoptionTrans<E> {
	
	private String read="";
	private int disp=0;
	
	public String inputStr_JO(String data){
		return JOptionPane.showInputDialog(null , data);
	}
	
	public int inputInt_JO(String data){
		read=JOptionPane.showInputDialog(null , data);
		disp=Integer.parseInt(read);
		return disp;
	}
	
	public void msg_JO(String message){
		JOptionPane.showMessageDialog(null, message);
	}
	
}
