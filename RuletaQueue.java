
import imports.GQueue; 																				//importar libreria creada para hacer uso de queues
import imports.JOtransform; 																		//importar libreria utilizada para agilizar el uso de JOptionsPane (una gui para recibir datos)

public class RuletaQueue {

	public static void main(String[] args) {
		GQueue<String> queue_main= new GQueue<String>() ; 											//Creacion de una queue vacia llamada queue_main
		anadir(queue_main); 																		//se llama la funcion anadir con la queue como parametro
	}
	
	public static void anadir(GQueue<String> queue_main){ 											//metodo encargado de añadir elementos, asi como removerlos e imprimirlos en forma de lista en el gui
		JOtransform<String> user_input= new JOtransform<String>(); 									//implementacion de la libreria creada para el JOptionsPane
		int numero_int=user_input.inputInt_JO("Escribe el numero de objetos"); 						//variable en la que el usuario define el numero de objetos que tendra la queue
		
		for (int x=0; x<numero_int; x++){ 															//for loop encargada de añadirle valores a la queue
			int num = x+1; 																			//variable creada para facilitar la visualizacion del orden de la queue en la gui
			String num_queue = user_input.inputStr_JO("Esctribe la letra # " + num); 				//variable en la cual se guarda la letra que se guardara en el siguiente lugar en la queue
			queue_main.enqueue(num_queue); 															//se agrega la letra guardada en num_que al final de la queue
			
		}
		String resfinal="{"; 																		//Se crea el string resfinal el cual tiene la intencion de desplegar los valores de la que en una lista
		while(!queue_main.isEmpty()){ 																//while encargado de hacer degueue agregando este valor en el string resfinal para hacer la lista
			resfinal+= queue_main.dequeue(); 														//dequeue que se agrega al string resfinal
			if (numero_int-1!=0){ 																	//if utilizzado para mejorar la apariencia de la lista creada arriba
				resfinal+=", "; 																	// se agregan las comas en la lista
			}
			numero_int--; 
		}
		resfinal+="}"; 																				// se cierra la lista
		user_input.msg_JO("El resultado de la Queue es:\n"+ resfinal); 								//se encarga de desplegar la lista resfinal en la guissss
	}

}
