/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Concepts;
abstract class Abstract{
double i,j;
Abstract(double a,double b){
i=a;
j=b;
}
abstract double show();
}
class RectSub extends Abstract{
    RectSub(double a,double b) {
        super(a,b);
    }
double show(){
    return i*j;
    }
}
class TriangSub extends Abstract{
    TriangSub(double a,double b) {
        super(a,b);
    }
double show(){
    return (i*j)/2;
    }
}
/**
 *
 * @author ASHOK
 */
public class AreaAbstract {
    public static void main(String[] args) {
        RectSub rs=new RectSub(20, 30);
        TriangSub ts=new TriangSub(40, 50);
        Abstract abs;
        abs=rs;
        System.out.println(abs.show());
        abs=ts;
        System.out.println(abs.show());
    }
}