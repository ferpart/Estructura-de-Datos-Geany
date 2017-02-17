
import imports.SLinkedList; //Importar linked list creada en laboratorio
import imports.JOtransform; //importar clase creada para sesplegar una ventana que pida un numero y se transforme de string a int


public class RuletaLinked { //Clase Principal

	public static void main(String[] args) { 
		SLinkedList<Integer> linked_list=new SLinkedList<Integer>(); //Creacion de la lista ligada que recibira parametros "Int"		
		anadir(linked_list, elementos(0,0)); //se llama a la funcion anadir dando como parametros la lista y un place-holder
	}
	
	public static void anadir(SLinkedList<Integer> linked_list, int elementos){ // clase encargada de añadir elementos a la lista ligada
		
		for (int x=0; x<elementos; x++){ //for que corre por el numero de elementos pre-establecidos por el usuario
			int paso=x+1;
			linked_list.add(x, elementos(1,paso)); //aqui se añaden los elementos definidos por el usuario
		}
		
		int obtener_indice=linked_list.get((elementos(2, elementos))-1); //esta variable recibe el indice que el usuario quiere que sea mostrado
		
		resp_final(obtener_indice, elementos); // este metodo recibe como parametro el indice, y el numero de elementos en la lista ligada
		
			
	}
	
	public static int elementos(int x, int y){ // este metodo esta encargado de la mayoria del gui, donde el usuario da los valores que quiere para la lista
		JOtransform<String> read_input= new JOtransform<String>();
		if (x==0){
			return read_input.inputInt_JO("Numero de elementos para lista ligada"); //regresa el numero de elementos de la lista que el usuario desea
		}	
		else if (x==1){
			return read_input.inputInt_JO("Dame el elemento #"+ y); //regresa la variable que el usuario desea agregar
		}
		else if (x==2){
			return read_input.inputInt_JO("Dime el elemento a mostrar desde 1 a "+ y ); //regresa el indice que el usuario escoge
		}
		
		else {
			return 0; //place holder por el funcionamiento del metodo
		}
		
	}
	
	public static void resp_final(int obtener_indice, int elementos){ //metodo encargado de mostrar con gui el indice elegido, y el elemento en ese indice
		JOtransform<String> message= new JOtransform<String>();
		message.msg_JO("El elemento #"+ elementos + //elementos es la funcion de arriba cuando recibe x==2 desplegando el indice del usuario.
		" de la lista es:\n" + 
		obtener_indice ); //obtener_indice nos da el valor en el indice que se recibio prebiamente
		
	}


}
