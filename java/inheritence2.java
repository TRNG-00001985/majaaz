

public class inheritence2 extends inheritence1 {
	int i = 3;
	inheritence2(){
		
		super();
		System.out.println("No args ctr child");
		
	}
	
	inheritence2(int a){
		super(5);
		System.out.println("Parameterised ctr child" + this.i);
		
	}
	
	
	public static void main(String[] args) {
		
		inheritence1 s = new inheritence1();
		inheritence1 cdp = new inheritence1(4);
		inheritence2 c = new inheritence2();
		inheritence2 cp = new inheritence2(6);
		
		
	}
}
