
public class hexa {
 public static void main (String args[]) {
	 fiz(9);
	 
 }
 
 public static void fiz(int a) {
 if(a%3==0 && a%5==0)
 {
	 System.out.println("FizzBuzz");
 }
 else if(a%3==0)
 {
	 System.out.println("Fizz");
 }
 else
	 System.out.println("Buzz");
}
}
