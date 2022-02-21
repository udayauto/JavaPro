package sample;

public class MethodEx {
	//data types
	
	int a=10;
	int b=20;
	int c;
	
	//method -- add
	
	public void add() { //block
	
		c=a+b;
		System.out.println("Sum of 2 values: " + c);
		
	}
	
	
	public static void main(String[] args) {
		
		//Objects.
		MethodEx obj = new MethodEx();
		obj.add();
		
		//methods -- 
		//statements 
		//re-usability. 
		
		
	}

}
