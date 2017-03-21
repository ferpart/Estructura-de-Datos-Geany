package imports;

public class RadixSortQueue{
	GQueue<Integer> bucket0= new GQueue<Integer>();
	GQueue<Integer> bucket1= new GQueue<Integer>();
	GQueue<Integer> bucket2= new GQueue<Integer>();
	GQueue<Integer> bucket3= new GQueue<Integer>();
	GQueue<Integer> bucket4= new GQueue<Integer>();
	GQueue<Integer> bucket5= new GQueue<Integer>();
	GQueue<Integer> bucket6= new GQueue<Integer>();
	GQueue<Integer> bucket7= new GQueue<Integer>();
	GQueue<Integer> bucket8= new GQueue<Integer>();
	GQueue<Integer> bucket9= new GQueue<Integer>();
	GQueue<Integer>   value= new GQueue<Integer>();
	GQueue<Integer> trash1 = new GQueue<Integer>();
	int mod = 10;
	int div = 1;
	int digitlen = 0;
	int j=0;
			
	public RadixSortQueue(){
		this(null);
	}
	public RadixSortQueue(GQueue<Integer> x){
		this.value=x;
	}
	public String sort(){
		return Listpass().toString();
	}
	private GQueue<Integer> Listpass(){
		return Listpass(value, mod, div);
	}
	private GQueue<Integer> Listpass(GQueue<Integer> valuen, int modn, int divn){
		GQueue<Integer> trash = new GQueue<Integer>();
		while(!valuen.isEmpty()){
			int element = valuen.dequeue();
			int sort = ((element%modn)/divn);
			int length = String.valueOf(element).length();
			if (j==0){
				if (digitlen<length){
					digitlen=length;
				}
			}
			if (j==digitlen){
				trash1.enqueue(element);
			}
			bucketstore(element,sort);
		}
		trash=bucketrelease();
		modn*=10;
		divn*=10;
		
		while(j<digitlen){
			j++;
			Listpass(trash,modn,divn);
		}
		return trash1;
	}	
	
	private void bucketstore(int element, int sort){
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
	private GQueue<Integer> bucketrelease(){
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


