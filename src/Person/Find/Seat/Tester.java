package Person.Find.Seat;

import java.util.ArrayList;

public class Tester {

	public static void main(String[] args) {
		Person go = new Person(100, 120);
		
		int feederData [] = {297,90,54,66,110,78,257,113,98,276,191,12,280,129,22,219,163,12,254,193,45,86,153,65,206,107,71,71,137,87,94,40,98,238,127,45,52,146,98,129,197,10,144,59,100,157,124,12,210,59,54,110,54,98,268,119,87,261,121,32,12,189,65,186,108,97,174,21,64,112,18,31,54,90,54,174,52,65,16,129,87,59,181,98,290,123,65,248,132,21};
		
		ArrayList<Chair> chairList = new ArrayList<Chair>();
		ArrayList<Porridge> porridgeList = new ArrayList<Porridge>();
		ArrayList<Light> lightList = new ArrayList<Light>();
		for (int i = 1; i < feederData.length+1; i++) {
			if(i%3==1)
			{
				chairList.add(new Chair(feederData[i-1]));
			}
			if(i%3==2)
			{
				porridgeList.add(new Porridge(feederData[i-1]));
			}
			if(i%3==0)
			{
				lightList.add(new Light(feederData[i-1]));
			}
		}
		System.out.println(go.calculate(chairList, porridgeList, lightList));
	}
}
