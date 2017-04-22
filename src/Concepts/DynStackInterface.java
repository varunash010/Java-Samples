/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Concepts;

interface IntFaceStack {

    void push(int item);

    int pop();
}

class DynStack implements IntStack {

    private int stck[];
    private int tos;

    DynStack(int size) {
        stck = new int[size];
        tos = -1;
    }

    public void push(int item) {
        if (tos == stck.length - 1) {
            int temp[]=new int[stck.length * 2];
            for(int i=0;i<stck.length;i++)
                temp[i]=stck[i];
                stck=temp;
                System.out.println(stck.length);
                stck[++tos]=item;
        } else {
            stck[++tos] = item;
        }
    }

    public int pop() {
        if (tos < 0) {
            System.out.println("underflow");
            return 0;
        } else {
            return stck[tos--];
        }
    }
}

/**
 *
 * @author ASHOK
 */
public class DynStackInterface {

    public static void main(String[] args) {
        DynStack fs = new DynStack(5);
        for (int i = 0; i < 10; i++) {
            fs.push(i);
            System.out.println("item pushed");
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(fs.pop());
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(fs.pop());
        }
    }
}