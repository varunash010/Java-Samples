/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyPrograms;

/**
 *
 * @author ASHOK
 */
public class ForEachTwoD {
    public static void main(String[] args) {
        int sum=0;
        int nums[][]=new int[3][5];
        
        for(int i=0;i<3;i++){
            for(int j=0;j<5;j++){
            nums[i][j]=(i+1)*(j+1);
        //System.out.println(nums[0][0]);
            }
         }
        for(int x[]:nums){
           System.out.println("row :" + x[0]);
            for(int y:x)
            System.out.println(y);
        }
    }
}
