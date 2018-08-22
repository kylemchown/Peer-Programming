package Calculator;

public class Runner {

	public static void main(String[] args) {
		Subtract sub = new Subtract();
		Addition add = new Addition();
		int[] test = {5, 3, 15, 10, 20, 30, 40, 50};
		sub.sub(test);
		add.add(1, 2, 3);
		

	}

}
