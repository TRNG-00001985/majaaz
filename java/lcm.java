
public class lcm {
	public static void main(String[] args) {
		int a = 6, b = 20;
		int max = (a>b)? a : b;
		
		while(true) {
			if(max % a == 0 && max % b == 0) {
				break;
			}
				max++;
		}
		System.out.println(max);
	}
}
