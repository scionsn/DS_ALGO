

/**
 max amount of rainwater on  a tower is zero , if there is no tower on its left 
 * and right with a height greater than the current tower.
 * but if there are towers on the left and right of current tower then
 * max amt of water on the current tower is 
 * min(max height of tower on left, max height of tower on right - current height of tower)
 */
public class rainwater_trap {
	public static void main(String[] args) {
		int towerheight[]={1,5,2,3,1,7,2,4};
		int maxright[]=new int[towerheight.length];
//		we avoid keeping an array for max left  as well , as it would affect our time complexity.
		int maxleft=0;
		int maxsofar=0;
		int  rainwater=0;
		for(int i=towerheight.length-1;i>=0;i--){
			if(towerheight[i]>maxsofar){
				maxsofar=towerheight[i];
				maxright[i]=maxsofar;
			}
			else
			{
				maxright[i]=maxsofar;
			}
		}
//integer .max is added to avoid negative values because it might be the case that when weh
//		subtract the height of current tower we might get a negative value
		for(int i=0;i<towerheight.length;i++){
			rainwater=rainwater+Integer.max(Integer.min(maxleft,maxright[i])-towerheight[i],0);
			if(towerheight[i]>maxleft){
				maxleft=towerheight[i];
			}
		}
		System.out.println("the rainwater collected is: "+ rainwater+"units");

	}

}
