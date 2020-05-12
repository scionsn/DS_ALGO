package leetcode;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * An image is represented by a 2-D array of integers, each integer representing the pixel value of the image (from 0 to 65535).

Given a coordinate (sr, sc) representing the starting pixel (row and column) of the flood fill, and a pixel value newColor, "flood fill" the image.

To perform a "flood fill", consider the starting pixel, plus any pixels connected 4-directionally to the starting pixel of the same color as the starting pixel, plus any pixels connected 4-directionally to those pixels (also with the same color as the starting pixel), and so on. Replace the color of all of the aforementioned pixels with the newColor.

At the end, return the modified image.
 * @author SCION
 */
public class FloodFill {
     public static int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        if(image[sr][sc]==newColor){
            return image;
        }
        fill(image,sr,sc,image[sr][sc],newColor);
        return image;
    }
   static  void  fill(int image[][],int i,int j,int prevcol,int newcol){
          if(i<0||j<0||i>=image.length||j>=image.length||image[i][j]!=prevcol){
              return;
          }
                 image[i][j]=newcol;

          fill(image,i+1,j,prevcol,newcol);
          fill(image,i-1,j,prevcol,newcol);
          fill(image,i,j+1,prevcol,newcol);
          fill(image,i,j-1,prevcol,newcol);

     }
    public static void main(String[] args) {
        int image[][]= {{1, 1, 1, 1, 1, 1, 1, 1}, 
                    {1, 1, 1, 1, 1, 1, 0, 0}, 
                    {1, 0, 0, 1, 1, 0, 1, 1}, 
                    {1, 2, 2, 2, 2, 0, 1, 0}, 
                    {1, 1, 1, 2, 3, 0, 1, 0}, 
                    {1, 1, 1, 2, 2, 2, 2, 0}, 
                    {1, 1, 1, 1, 1, 2, 1, 1}, 
                    {1, 1, 1, 1, 1, 2, 2, 1}, 
                    };
      int res[][]=  floodFill(image,4,4,3);
      for(int i=0;i<res.length;i++){
          for(int j=0;j<res.length;j++)
          {
              System.out.println(image[i][j]);
          }
      }
        
    }
}
