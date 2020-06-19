import java.util.ArrayList;

public class RatmazePath {
	static ArrayList<String> getRatMazePath(int startRow, int startCol,int endRow,int endCol)
	{
		if(startRow==endRow && startCol==endCol)
		{
			ArrayList<String> blankStringList = new ArrayList<>();
			blankStringList.add("\n");
			return blankStringList;
		}
		if(startRow>endRow || startCol>endCol)
		{
			ArrayList<String> blankList= new ArrayList<>();
			return blankList;
		}
		ArrayList<String> finalResult= new ArrayList<>();
		ArrayList<String> horzResult = getRatMazePath(startRow+1, startCol , endRow ,endCol);
		for(String horz : horzResult)
		{
			finalResult.add("H"+ horz);
		}
		ArrayList<String> vertResult= getRatMazePath(startRow,startCol+1,endRow,endCol);
		for(String vert : vertResult)
		{
			finalResult.add("V"+ vert);
		}
//		ArrayList<String> diaResult= getRatMazePath(startRow+1,startCol+1,endRow,endCol);
//		for(String dia : diaResult)
//		{
//			finalResult.add("D"+ dia);
//		}
		return finalResult;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getRatMazePath(0,0,2,2));

	}

}
