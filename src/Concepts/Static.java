/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Concepts;
class UseStatic{
static int a=3,b;
static void meth(int x){
System.out.println("x= " + x);
    System.out.println("a= " + a);
    System.out.println("b = " + b);
}
static{
    System.out.println("stsatic block");
    b=a*4;
}
}
public class Static{
    public static void main(String[] args) {
        UseStatic.meth(10);
    }
}
/**
 *
 * @author ASHOK
 */

