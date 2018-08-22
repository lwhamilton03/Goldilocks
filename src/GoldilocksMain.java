import java.util.ArrayList;

public class GoldilocksMain {

	public static void main(String[] args) {
		
		
		Goldilock gold = new Goldilock(100, 120);
		
		//ArrayList<(int)Array> arrayGold = new ArrayList<Integer>(); 
	
		//arrayGold.set(0, [20, 10]); 
		
		ArrayList<Integer> weightList = new ArrayList<Integer>();
		ArrayList<Integer> tempList = new ArrayList <Integer>(); 
		
		weightList.add(297);
		weightList.add(66);
		weightList.add(257);
		weightList.add(276);
		weightList.add(280);
		weightList.add(219);
		weightList.add(254);
		weightList.add(86);
		weightList.add(206);
		weightList.add(71);
		weightList.add(94);
		weightList.add(238);
		weightList.add(52);
		weightList.add(129);
		weightList.add(144);
		weightList.add(157);
		weightList.add(210);
		weightList.add(110);
		weightList.add(268);
		weightList.add(261);
		weightList.add(12);
		weightList.add(186);
		weightList.add(174);
		weightList.add(112);
		weightList.add(54);
		weightList.add(174);
		weightList.add(112);
		weightList.add(54);
		weightList.add(174);
		weightList.add(16);
		weightList.add(59);
		weightList.add(290);
		weightList.add(248);
		
		
		tempList.add(90);
		tempList.add(110);
		tempList.add(113);
		tempList.add(191);
		tempList.add(129);
		tempList.add(163);
		tempList.add(193);
		tempList.add(153);
		tempList.add(107);
		tempList.add(137);
		tempList.add(40);
		tempList.add(127);
		tempList.add(146);
		tempList.add(197);
		tempList.add(59);
		tempList.add(124);
		tempList.add(59);
		tempList.add(54);
		tempList.add(119);
		tempList.add(121);
		tempList.add(189);
		tempList.add(108);
		tempList.add(21);
		tempList.add(18);
		tempList.add(90);
		tempList.add(52);
		tempList.add(129);
		tempList.add(181);
		tempList.add(123);
		tempList.add(132);
		
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
