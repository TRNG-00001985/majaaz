
public class hexatoocta {
public static void main (String args[]) {
	String hexa,octa;
	int deca;
	hexa="a53";
    deca=Integer.parseInt(hexa,16);
	octa=Integer.toOctalString(deca);
	System.out.print(octa);
}
}
