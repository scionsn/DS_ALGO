import java.util.ArrayList;

public class DiceGame {
	static ArrayList<String> reachTo10(int startPoint, int endPoint)
	{
		if(startPoint==endPoint)
		{
			ArrayList<String> blankStringList= new ArrayList<>();
			blankStringList.add("\n");
			return blankStringList;
		}
		if(startPoint>endPoint)
		{
			ArrayList<String> blankList= new ArrayList<>();
			return blankList;
		}
		ArrayList<String> result= new ArrayList<>();
		for(int dice=1; dice<=3; dice++)
		{
			int newStartPoint= dice + startPoint;
			ArrayList<String> temp = reachTo10(newStartPoint, endPoint);
					for(String tempStr : temp)
					{
						result.add(dice + tempStr);
					}
		}
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reachTo10(0,10));

	}

}
