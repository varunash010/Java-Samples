/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Concepts;
class ASuper{
int i;
}
class BSub extends ASuper{
int i;
BSub(int a,int b){
super.i=a;
i=b;
}
void show(){
    System.out.println(i + " " + super.i);
}
}
/**
 *
 * @author ASHOK
 */
public class SuperMember {
    public static void main(String[] args) {
        BSub bsub=new BSub(10, 20);
        bsub.show();
    }
}