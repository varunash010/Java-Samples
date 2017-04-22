/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Concepts;
class A{
int i,j;
A(int a,int b){
i=a;
j=b;
}
void show(){
    System.out.println("i = " + i + " " + j);
}
}
class B extends A{
int k;
B(int a,int b,int c){
super(a,b);
k=c;
}

void show(){
    super.show();
    System.out.println("k = "+ k + " i= " +  i + " j= " + j);
}
}
class C extends B{
int l;
C(int a,int b,int c,int d){
super(a,b,c);
l=d;
}
void show(){
    System.out.println(k);
}
}
class MethodOverriding{
    public static void main(String[] args) {
        B b=new B(1,2,3);
        b.show();
    }
}
/**
 *
 * @author ASHOK
 */

