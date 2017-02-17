
import imports.SLinkedList; //Importar linked list creada en laboratorio
import imports.JOtransform; //importar clase creada para sesplegar una ventana que pida un numero y se transforme de string a int


public class RuletaLinked { //Clase Principal

	public static void main(String[] args) { //main
		SLinkedList<Integer> linked_list=new SLinkedList<Integer>(); //Creacion de la lista ligada que recibira parametros "Int"		
		anadir(linked_list, elementos(0,0));
	}
	
	public static void anadir(SLinkedList<Integer> linked_list, int elementos){
		
		for (int x=0; x<elementos; x++){
			int paso=x+1;
			linked_list.add(x, elementos(1,paso));
		}
		
		int obtener_indice=linked_list.get((elementos(2, elementos))-1);
		
		resp_final(obtener_indice, elementos);
		
			
	}
	
	public static int elementos(int x, int y){
		JOtransform<String> read_input= new JOtransform<String>();
		if (x==0){
			return read_input.inputInt_JO("Numero de elementos para lista ligada");
		}	
		else if (x==1){
			return read_input.inputInt_JO("Dame el elemento #"+ y);
		}
		else if (x==2){
			return read_input.inputInt_JO("Dime el elemento a mostrar desde 1 a "+ y );
		}
		
		else {
			return 0;
		}
		
	}
	
	public static void resp_final(int obtener_indice, int elementos){
		JOtransform<String> message= new JOtransform<String>();
		message.msg_JO("El elemento #"+ elementos + " de la lista es:\n" + obtener_indice );
		
	}


}
