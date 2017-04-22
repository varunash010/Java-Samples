/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Concepts;
abstract class Abs{
abstract void show();
void callmetoo(){
    System.out.println("callmetoo");
}
}
class Bclass extends Abs{
void show(){
    System.out.println("B class show method");
}
}
/**
 *
 * @author ASHOK
 */
public class AbstractClass {
    public static void main(String[] args) {
        Bclass b=new Bclass();
        b.show();
    }
}
