package allprograms;

import java.util.Scanner;

public class StringTest {

	public static void main(String[] args) {
		StringProgram sp = new StringProgram();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		String s = sc.next();
		while (true) {
			System.out.println(
					" 1 evenfirst \n 2 primefirst \n 3 halfreverse \n 4 primeUppercase \n 5 firsthalfrevrse \n 6 reverse \n 7 exit \n");
			int option = sc.nextInt();
			switch (option) {
			case 1: {
				System.out.println(sp.even(s));
				break;
			}
			case 2: {
				System.err.println(sp.prime(s));
				break;
			}
			case 3: {
				System.out.println(sp.halfRev(s));
				break;
			}
			case 4: {
				System.out.println(sp.Upper(s));
				break;
			}
			case 5: {
				System.out.println(sp.lastHalf(s));
				break;
			}
			case 6: {
				System.out.println(sp.replace(s));
				break;
			}
			case 7: {
				System.exit(0);
//				return;
			}
			default :{
				System.out.println("please choose correct option");
				break;
			}

			}

		}
	}

}
