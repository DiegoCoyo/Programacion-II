class Pila {

	private int n; 
	private long[] arreglo;
	private int top; 
	
	public Pila(int n) { 
		this.n = n; 
		arreglo = new long[n]; 
		top = -1; 
	}
	public void push(long e) { 
		if (!isFull()) {
			top++;            
			arreglo[top] = e;
		} else
			System.out.println("Pila llena.");
	}
	public long pop() { 
		long e = Long.MIN_VALUE;
		if (!isEmpty()){
			e = arreglo[top]; 
			top--;            
		} else
			System.out.println("Pila vacia.");
		return e;
	}
	public long peek() { 
		long e = Long.MIN_VALUE;
		if (!isEmpty()){
			e = arreglo[top];
		} else
			System.out.println("Pila vacia.");
		return e;
	}
	public boolean isEmpty() { 
		return (top == -1);
	}
	public boolean isFull() { 
		return (top == this.n - 1);
	}
}
