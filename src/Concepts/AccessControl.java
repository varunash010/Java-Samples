/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Concepts;
class AC{
int a;
public int b;
private int c=10;

void setc(int i){
c=i;
}
int getc(){
return c;
}
}
/**
 *
 * @author ASHOK
 */
public class AccessControl {
    public static void main(String[] args) {
        AC ob=new AC();
        AC ob1=new AC();
        ob.a=10;
        ob.b=20;
        ob.setc(100);
        ob1.setc(150);
        System.out.println(ob.a + " " + ob.b + " " + ob.getc());
    }
}
