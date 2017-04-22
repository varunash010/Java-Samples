/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package samples;

/**
 *
 * @author ASHOK
 */
public class EnhancedFor {
    public static void main(String[] args) {
        int nums[]={1,2,3,4,5,6,7,8,9,10};
        int sum=0;
        for(int x:nums) {sum+=x;
        //x*=10;
        System.out.println("Value is" + x);
        System.out.println(sum);
    }
        for(int x:nums) System.out.println(x);
    }
    }
