/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Concepts;
class TestStack{
int stck[]=new int[10];
int tos;

    TestStack() {
    tos=-1;
    }
void push(int item){
if(tos==9)
        System.out.println("Stack is full");
else
    stck[++tos]=item;
}
int pop(){
if(tos<0){
    System.out.println("Stack underflow");
    return 0;
}
else
    return stck[tos--];
}
}
/**
 *
 * @author ASHOK
 */
public class Stack {
    public static void main(String[] args) {
    TestStack ts=new TestStack();
    TestStack ts2=new TestStack();
    for(int i=0;i<10;i++){
        ts.push(i);
    }
        System.out.println("ts");
        for(int i=0;i<5;i++){
            System.out.println(ts.pop());
        }
        ts.push(10);
        ts.push(20);
        for(int i=0;i<5;i++){
            System.out.println(ts.pop());
        }
    }
}
