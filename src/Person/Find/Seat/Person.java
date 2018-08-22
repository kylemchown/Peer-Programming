package Person.Find.Seat;

import java.util.ArrayList;

public class Person {
	
	private int weight;
	private int maxTemp;
	final int luminosity = 70;
	
	public Person(int wei, int maxt) {
		this.weight = wei;
		this.maxTemp = maxt;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getMaxTemp() {
		return maxTemp;
	}
	public void setMaxTemp(int maxTemp) {
		this.maxTemp = maxTemp;
	}
	
	public String calculate (ArrayList<Chair> cha, ArrayList<Porridge> por, ArrayList<Light> lig)
	{
		String returnS = "";
		for (int i = 0; i < cha.size(); i++) {
			if(this.weight<cha.get(i).getMaxWeight()&&this.maxTemp>por.get(i).getTemperature()&&luminosity<=lig.get(i).getLuminosity())
			{
				returnS+= "#"+(i+1)+" ";
			}
		}
		return returnS;
	}
}
