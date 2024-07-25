
public class constructors {
  constructors()
  {
	  System.out.println("yo");
  }
  constructors(int a)
  {
	  System.out.println("yo yo" +a);
  }
  
  public static void main(String args[])
  {
	  constructors c= new constructors();
	  constructors c1= new constructors(4);
  }
}
