/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Concepts;

class Outer{
static int outer_x=100,y=10;
void test(){
   for(int i=0;i<5;i++){
Inner inner=new Inner();
inner.display();
}
}
class Inner{
int x=10;
    void display(){
System.out.println("hello" + outer_x);
System.out.println(x + y);
}
}
}
/**
 *
 * @author ASHOK
 */
public class Innerclass {
    public static void main(String[] args) {
        Outer outer=new Outer();
        outer.test();
    }   
}