/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Concepts;
class Test{
int a,b;
Test(int i,int j){
a=i;
b=j;
}

boolean equalTo(Test o){
if(o.a==a && o.b==b)return true; 
else
return false;
}
}
/**
 *
 * @author ASHOK
 */
public class ObjectParameter {
    public static void main(String[] args) {
        Test ob1=new Test(10,20);
        Test ob2=new Test(10,20);
        Test ob3=new Test(0,0);
        System.out.println(ob1.equalTo(ob2));
        System.out.println(ob1.equalTo(ob3));
    }
}
