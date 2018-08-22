package Calculator;

public class Addition {
	
	public String add(int f, int s, int t) {
		if (f + s == t) {
			System.out.println("" + f + " + " + s + " = " + t);
		}
		if (f + t == s) {
			System.out.println("" + f + " + " + t + " = " + s);
		}
		if (s + t == f) {
			System.out.println("" + s + " + " + t + " = " + f);
		}
		
		
	
		return null;
	}
}
