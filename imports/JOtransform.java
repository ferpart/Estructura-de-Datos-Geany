package imports;

import javax.swing.JOptionPane;

public class JOtransform<E> implements JoptionTrans<E> {
	
	private String read="";
	private int disp=0;
	
	public int input_JO(E data){
		read=JOptionPane.showInputDialog(data);
		disp=Integer.parseInt(read);
		return disp;
	}
	
}
