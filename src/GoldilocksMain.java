import java.util.ArrayList;

public class GoldilocksMain {

	public static void main(String[] args) {
		
		
		Goldilock gold = new Goldilock(100, 80);
		
		//ArrayList<(int)Array> arrayGold = new ArrayList<Integer>(); 
	
		//arrayGold.set(0, [20, 10]); 
		
		ArrayList<Integer> weightList = new ArrayList<Integer>();
		ArrayList<Integer> tempList = new ArrayList <Integer>(); 
		
		weightList.add(30);
		weightList.add(130);
		weightList.add(90);
		weightList.add(150);
		weightList.add(120);
		weightList.add(200);
		weightList.add(110);
		
		tempList.add(50);
		tempList.add(60);
		tempList.add(60);
		tempList.add(85);
		tempList.add(70);
		tempList.add(200);
		tempList.add(100);
		
		System.out.println(weightList);
		System.out.println(tempList);
		
		System.out.println(gold.checkGold(34, 200));
		
		
		String totalSeats = " ";
		
		for(int i = 0; i <= tempList.size() -1; i++)
		{
			boolean check = gold.checkGold(weightList.get(i), tempList.get(i));
			
			if (check)
			{
				totalSeats = totalSeats + (i + 1) + ", ";
			}
		
		}
		
		System.out.println("The seats" + totalSeats + "are good enough chairs for her to sit on and the porridge is good enough for her to eat");
		
		
	
	}

}
