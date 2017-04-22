/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Concepts;

/**
 *
 * @author ASHOK
 */
public class FixedDynStackInterface {
    public static void main(String[] args) {
        IntStack fs=new FixedStack(5);
        IntStack ds=new DynStack(5);
        for(int i=0;i<5;i++){
        fs.push(i);
        }
        for(int i=0;i<5;i++){
            System.out.println("fixedstack");
            System.out.println(fs.pop());
        }
        System.out.println("Dynstack");
    for(int i=0;i<10;i++){
        ds.push(i);
        }
        for(int i=0;i<5;i++){
            System.out.println("dynstack :" + i);
            System.out.println(ds.pop());
        }
    }
}