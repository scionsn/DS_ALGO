/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

/**
 *just for git purposes
 * @author SCION
 * You are given an array coordinates, coordinates[i] = [x, y], where [x, y] represents the coordinate of a point. Check if these points make a straight line in the XY plane.
 * e.g- Input: coordinates = [[1,2],[2,3],[3,4],[4,5],[5,6],[6,7]]
Output: true
 */
public class CheckStraightLine {
    public static boolean checkStraightLine(int[][] coordinates) {
        int size=coordinates.length;
        int x=coordinates[1][0]-coordinates[0][0];
                int y=coordinates[1][1]-coordinates[0][1];
for(int i=2;i<size;i++){
    int currentx=coordinates[i][0]-coordinates[i-1][0];
    int currenty=coordinates[i][1]-coordinates[i-1][1];
if(currenty*x!=y*currentx){
    return false;
}

}
return true;
    }

    
    public static void main(String[] args) {
        int arr[][]={{1,2},{2,3},{3,4}};
        checkStraightLine(arr);
    }
}
