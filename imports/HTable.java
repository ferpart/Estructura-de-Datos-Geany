package imports;

import java.math.BigInteger;																						//Para poder usar el KEY, que es un String con su valor en ASCII

public class HTable {

    private final static int TABLE_SIZE = 17;																		//Define el tamaño de la tabla, se usa como MOD (29 es un numero primo
    Entry[] htable;

    public HTable() {
          htable = new Entry[TABLE_SIZE];
          for (int i = 0; i < TABLE_SIZE; i++)
                htable[i] = null;
    }

    public int Search(String key) {
    	  int i =0;
          int hash = new BigInteger(ToAscii(key)).mod(new BigInteger(((Integer)TABLE_SIZE).toString())).intValue();	//Regresa la "DATA" de un ENTRY a partir de aplicar HASH a KEY
          int hash2=hash;
          while (htable[hash2] != null && htable[hash2].getKey() != key)
                hash2 = (hash + i^2) % TABLE_SIZE;
          	 	i++;
          if (htable[hash] == null)
                return -1;
          else
                return htable[hash2].getData();
    }

    public void Write(String key, int data) {																			//Añade una DATA a la TABLA, pide KEY y el valor DATA
    	  int i = 0;
          int hash = new BigInteger(ToAscii(key)).mod(new BigInteger(((Integer)TABLE_SIZE).toString())).intValue();
          int hash2 =hash;
          while (htable[hash2] != null && htable[hash2].getKey() != key)
        	  hash2 =(hash + i^2) % TABLE_SIZE;
           	  i++;
           	  //System.out.println(hash2);
          htable[hash2] = new Entry(key, data);
    }
    

    public static String ToAscii(String skey){																		//Convierte la KEY tipo string en su valor ACII (int)
        StringBuilder sb = new StringBuilder();
        int asciiInt;

        for (int i = 0; i < skey.length(); i++){																	//Busca cada valor de los caracteres del String

            char c = skey.charAt(i);
            asciiInt = (int)c; 
            sb.append(asciiInt);
            
        }
        //System.out.println(String.valueOf(sb));
        return String.valueOf(sb);
    }
    
    public String listafinal(){
    	String listaf="";
    	for(int i=0; i<TABLE_SIZE; i++){
    		if (htable[i]!=null){
    			listaf+=(htable[i].getKey()+":");
    			listaf+=(htable[i].getData()+"\n");
    		}
    		else {
				listaf+=("null\n");
			}
    	}
    	return listaf;
    }
}
