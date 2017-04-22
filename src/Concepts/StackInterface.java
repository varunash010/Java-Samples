/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Concepts;

interface IntStack {

    void push(int item);

    int pop();
}

class FixedStack implements IntStack {

    private int stck[];
    private int tos;

    FixedStack(int size) {
        stck = new int[size];
        tos = -1;
    }

    public void push(int item) {
        if (tos == stck.length - 1) {
            System.out.println("overflow");
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
public class StackInterface {

    public static void main(String[] args) {
        FixedStack fs = new FixedStack(5);
        for (int i = 0; i < 10; i++) {
            fs.push(i);
            System.out.println("item pushed");
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(fs.pop());
        }
    }
}