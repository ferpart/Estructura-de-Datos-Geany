import imports.GQueue;
import imports.RadixSortQueue;
import javax.swing.JOptionPane;

public class RadixSortQueue_ruleta {

	public static void main(String[] args) {
		GQueue<Integer> mainqueue = new GQueue<Integer>();
		int numcompras = Integer.parseInt(JOptionPane.showInputDialog(null, "Dame cuantos gastos hiciste hoy:"));
		for(int i=0; i<numcompras; i++){
			mainqueue.enqueue(Integer.parseInt(JOptionPane.showInputDialog(null, "Dame los gastos que hiciste el dia de hoy:")));
		}
		RadixSortQueue sorter = new RadixSortQueue(mainqueue);
		
		JOptionPane.showMessageDialog(null, ("Tus compras organizadas del dia de hoy son:\n")+ sorter.sort());
		
	}

}
