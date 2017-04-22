/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Concepts;
class One{
void callme(){
    System.out.println("this is A callme");
}
}
class Two extends One{
void callme(){
    System.out.println("this is B callme");
}
}
class Three extends Two{
void callme(){
    System.out.println("this is C callme");
}
}
/**
 *
 * @author ASHOK
 */
public class DynamicMethodDisp {
    public static void main(String[] args) {
        One a=new One();
        Two b=new Two();
        Three c=new Three();
        One r;
        r=a;
        r.callme();
        r=c;
        r.callme();
    }
}
