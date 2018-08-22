package Calculator;

public class Subtract {
	
	public void sub(int[] num) {
		for(int i : num) {
			for(int j : num) {
				for (int k : num) {
					if (i - j == k) {
						System.out.println("" + i + " - " + j + " = " + k);
					}
				}
				//System.out.println(i - j);
			}
		}
	}
	public String sub(int first, int second, int third) {
		return null;
	}

}
