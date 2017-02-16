
import imports.SLinkedList; //Importar linked list creada en laboratorio
import imports.JOtransform; //importar clase creada para sesplegar una ventana que pida un numero y se transforme de string a int
import javax.swing.JOptionPane; //importar libreria de GUI "Swing"

public class RuletaLinked { //Clase Principal

	public static void main(String[] args) { //main
		SLinkedList<Integer> linked_list=new SLinkedList<Integer>(); //Creacion de la lista ligada que recibira parametros "Int"
		int num_elementos=0; //
		int num_paso=0; //
		anadir(linked_list, elementos(num_elementos, num_paso));
	}
	
	public static void anadir(SLinkedList<Integer> linked_list, int numElementos){
		
		
		if (!linked_list.isEmpty()){
			linked_list.addFirst(elementos(1, 0));
		}
		for (int x=0; x<numElementos; x++){
			int paso=x+1;
			linked_list.add(x, elementos(2,paso));
		}
		
		//JOptionPane.showMessageDialog(null, "El elemento #"+ numElementos + " de la lista es:\n" + linked_list.get(elementos(3, numElementos)) );
		resp_final(linked_list, numElementos);
		
			
	}
	
	public static int elementos(int x, int y){
		JOtransform<String> read_input= new JOtransform<String>();
		if (x==0){
			return read_input.input_JO("Numero de elementos para lista ligada");
		}
		else if (x==1){
			return read_input.input_JO("Dame el elemento #1");
		}
		
		else if (x==2){
			return read_input.input_JO("Dame el elemento #"+ y);
		}
		else if (x==3){
			return read_input.input_JO("Dime el elemento a mostrar desde 1 a "+ y );
		}
		
		else {
			return 0;
		}
		
	}
	
	public static void resp_final(SLinkedList<Integer> linked_list, int numElementos){
		JOptionPane.showMessageDialog(null, "El elemento #"+ numElementos + " de la lista es:\n" + linked_list.get((elementos(3, numElementos))-1) );
	}

}
