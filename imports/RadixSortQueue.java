package imports;

public class RadixSortQueue{
	GQueue<Integer>  bucket0 = new GQueue<Integer>();                                               //Se hace la creacion de las 9 queues necesitadas como buckets
	GQueue<Integer>  bucket1 = new GQueue<Integer>();                                               //
	GQueue<Integer>  bucket2 = new GQueue<Integer>();                                               //
	GQueue<Integer>  bucket3 = new GQueue<Integer>();                                               //
	GQueue<Integer>  bucket4 = new GQueue<Integer>();                                               //
	GQueue<Integer>  bucket5 = new GQueue<Integer>();                                               //
	GQueue<Integer>  bucket6 = new GQueue<Integer>();                                               //
	GQueue<Integer>  bucket7 = new GQueue<Integer>();                                               //
	GQueue<Integer>  bucket8 = new GQueue<Integer>();                                               //
	GQueue<Integer>  bucket9 = new GQueue<Integer>();                                               //
	GQueue<Integer>    value = new GQueue<Integer>();                                               //Se crea la queue que guardata los valores que van a ser ordenados  
	GQueue<Integer> finalval = new GQueue<Integer>();                                               //Se crea una queue que desplegara la queue ordenada
	int mod = 10;                                                                                   //Valor inicial de modulo
	int div = 1;                                                                                    //Valor inicial del divisor
	int digitlen = 0;                                                                               //Valor inicial del tamano de los digitos
	int j=0;                                                                                        //Valor inicial del contador
			
	public RadixSortQueue(){                                                                        
		this(null);
	}
	public RadixSortQueue(GQueue<Integer> x){
		this.value=x;
	}
	public String sort(){                                                                           //Metodo llamada sort() que regresa en string los valores ordenados de la queue
		return Listpass().toString();
	}
	private GQueue<Integer> Listpass(){                                                             
		return Listpass(value, mod, div);
	}
	private GQueue<Integer> Listpass(GQueue<Integer> valuen, int modn, int divn){                   //Metodo listpass que recibe laqueue original, y regresa la queue final val, ccn los valores ordenados
		GQueue<Integer> trash = new GQueue<Integer>();                                              //Se crea una queue de basura temporal
		while(!valuen.isEmpty()){                                                                   //Este while esta engargado de recibir los elementos de la queue y guardadlos en uno de los buckets, hasta que se vacie el queue original
			int element = valuen.dequeue();                                                         //Se guarda el valor de el elemento acutal en un entero llamado element
			int sort = ((element%modn)/divn);                                                       //Sort almacena el numero que se obtiene despues de aplicar la funcion modulo y dvidirlo, para asi decidir en que cubeta sera guardado dicho elemnto
			int length = String.valueOf(element).length();                                          //Almacena el numero de digitos del elemento que esta siendo usado en el momento en el entero length
			if (j==0){                                                                              //Solo en la vuelta inicial se corre este if
				if (digitlen<length){                                                               //se compara el valor de digitlen(que al inicio es 0) y si es que length es mayor que digitlengt, digitlength toma el valor de length
					digitlen=length;
				}
			}
			if (j==digitlen){                                                                       //Si es que el contador es igual al numero e digitos en el mayor integer se corre este if
				finalval.enqueue(element);                                                          //A la queue finalval se le hace enqueue de los elementos ya ordenados
			}
			bucketstore(element,sort);                                                              //Se corre el metodo bucket store que recibe el elemento, y la llave (llamada sort)
		}
		trash=bucketrelease();                                                                      //La queue temporal trash toma el valor de bucketrelease (El cual es un metodo que regresa una queue)
		modn*=10;                                                                                   //modn se multiplica por 10
		divn*=10;                                                                                   //divn se multiplica por 10
		
		while(j<digitlen){                                                                          //Este while hace recursion siempre y cuando el contador sea menor a digitlen
			j++;                                                                                    //Se hace un aumento al contador
			Listpass(trash,modn,divn);                                                              //Se hace recursion ahora con la queue almacenada en trash, asi con los nuevos valores de mod y div
		}
		return finalval;                                                                            //Cuando termina el while, se regresa la queue final val
	}	
	
	private void bucketstore(int element, int sort){                                                //Metodo que hace el uso de switch cases que utilizan sort como llave para almacenar el elemento en su determinado queue
		switch(sort){
			case 0 :bucket0.enqueue(element); 
					break;
			case 1 :bucket1.enqueue(element);
					break;
			case 2 :bucket2.enqueue(element);
					break;
			case 3 :bucket3.enqueue(element);
					break;
			case 4 :bucket4.enqueue(element);
					break;
			case 5 :bucket5.enqueue(element);
					break;
			case 6 :bucket6.enqueue(element);
					break;
			case 7 :bucket7.enqueue(element);
					break;
			case 8 :bucket8.enqueue(element);
					break;
			case 9 :bucket9.enqueue(element);
					break;
		}
	}
	private GQueue<Integer> bucketrelease(){                                                        //Metodo que obtiene las cubetas en orden de 0-9 que va vaciando y anadiendo elementos a un nuevo queue llamado valuefin
		GQueue<Integer> valuefin= new GQueue<Integer>();
		if (!bucket0.isEmpty()){
			while(bucket0.size()>0){
				valuefin.enqueue(bucket0.dequeue());
			}
		}
		if (!bucket1.isEmpty()){
			while(bucket1.size()>0){
				valuefin.enqueue(bucket1.dequeue());
			}
		}
		if (!bucket2.isEmpty()){
			while(bucket2.size()>0){
				valuefin.enqueue(bucket2.dequeue());
			}
		}
		if (!bucket3.isEmpty()){
			while(bucket3.size()>0){
				valuefin.enqueue(bucket3.dequeue());
			}
		}
		if (!bucket4.isEmpty()){
			while(bucket4.size()>0){
				valuefin.enqueue(bucket4.dequeue());
			}
		}
		if (!bucket5.isEmpty()){
			while(bucket5.size()>0){
				valuefin.enqueue(bucket5.dequeue());
			}
		}
		if (!bucket6.isEmpty()){
			while(bucket6.size()>0){
				valuefin.enqueue(bucket6.dequeue());
			}
		}
		if (!bucket7.isEmpty()){
			while(bucket7.size()>0){
				valuefin.enqueue(bucket7.dequeue());
			}
		}
		if (!bucket8.isEmpty()){
			while(bucket8.size()>0){
				valuefin.enqueue(bucket8.dequeue());
			}
		}
		if (!bucket9.isEmpty()){
			while(bucket9.size()>0){
				valuefin.enqueue(bucket9.dequeue());
			}
		}
		return valuefin;
	}

}


