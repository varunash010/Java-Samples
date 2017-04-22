/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Concepts;
class VarArgsTest{
static void vaTest(int ... v){
    System.out.println("contents for int : ");
for(int x : v){
    System.out.print(x + " ");
}
}
static void vaTest(boolean ... v){ 
    System.out.println("contents for boolean : ");
    for(boolean x : v){
        System.out.print(x + " ");
    }
}
static void vaTest(String msg,int ... v){ 
    System.out.println("contents for varargs : ");
    for(int x : v){
        System.out.print(x + " ");
    }
} 
}
/**
 *
 * @author ASHOK
 */
public class VarArgs {
    public static void main(String[] args) {
     VarArgsTest.vaTest("hello",1,2);   
     VarArgsTest.vaTest(2,3,4,5,6,7,8,9,1,2,3,4,5,6);
     VarArgsTest.vaTest(true,true,false);
    }
    //VarArgsTest vat=new VarArgsTest();
}
