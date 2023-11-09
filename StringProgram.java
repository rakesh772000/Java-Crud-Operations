package allprograms;

public class StringProgram {

	public String even(String s) {
		String ss = "";
		String s1 = "";
		String s2 = "";
		for (int i = 0; i < s.length(); i++) {

			if (i % 2 == 0) {
				s1 = s1 + s.charAt(i);

			} else {
				s2 = s2 + s.charAt(i);
			}
		}

		return s1 + s2;

	}

	public String prime(String s) {
		String p = "", ph = "";
		for (int i = 0; i < s.length(); i++) {
			if (primecheck(i)) {
				p = p + s.charAt(i);

			} else {
				ph = ph + s.charAt(i);
			}

		}
		return p + ph;

	}

	public boolean primecheck(int n) {
		int c = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				c++;
			}
		}
		return c == 2;

	}

	public String halfRev(String s) {
		String f = "", s1 = "";
		for (int i = 0; i < s.length(); i++) {
			if (i < s.length() / 2) {
				f = s.charAt(i) + f;
			} else {
				s1 = s.charAt(i) + s1;
			}

		}
		return f + s1;

	}

	public String Upper(String s) {
		String p = "", ph = "";
		char ch1;
		for (int i = 0; i < s.length(); i++) {
			if (primecheck(i)) {
				String ch = s.toUpperCase();
				ch1 = ch.charAt(i);

			} else {
				String ch2 = s.toLowerCase();
				ch1 = ch2.charAt(i);

			}
			p = p + ch1;

		}
		return p;

	}

	public String lastHalf(String s) {
		String f = "", l = "";
		for (int i = 0; i < s.length(); i++) {
			if (i < s.length() / 2) {
				f = s.charAt(i) + f;
			} else {
				l = l + s.charAt(i);
			}

		}
		return l + f;

	}

	public char[] replace(String s) {
		char[] ch = s.toCharArray();
		char ch1;
		int n = ch.length-1;
		int n1 = 0;
		for (int i = 0; i < s.length(); i++) {
			if (i == n1) {
				ch1 = ch[i += 2];
				ch[i] = ch[n -= 2];
				ch[n] = ch1;
				n1 += 2;
			}
		}

		return ch;

	}

 }
