
public class octatohexa {
public static void main (String args[]) {
String hex,oct;
int dec;

oct="5123";
dec=Integer.parseInt(oct,8);
hex=Integer.toHexString(dec);
System.out.print(hex);

}

}
