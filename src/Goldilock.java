
public class Goldilock {

	private int weight; 
	private int temp; 
	
	public Goldilock(int weight, int temp)
	{
		this.weight = weight;
		this.temp = temp;
	}
	
	public int getWeight()
	{
		return weight;
	}

	public int getTemp()
	{
		return temp;
	}
	
	public boolean checkGold(int wee, int tee)
	{
	//	int countWee = 0;
		// int countTee = 0;
		
				if (wee <= this.weight && tee <= this.temp)
		{
					return true;
			// countWee++; 
			// countTee++; 
			
		}
				else 
				{
					return false;
				}
		
	}
}

