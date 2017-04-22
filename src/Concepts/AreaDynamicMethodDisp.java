/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Concepts;
class Figure{
double i,j;
Figure(double a,double b){
i=a;
j=b;
}
double show(){
    //System.out.println("error");
    return 0;
}
}
class Rectangle extends Figure{
    Rectangle(double a,double b) {
        super(a,b);
    }
double show(){
    return i*j;
    }
}
class Triangle extends Figure{
    Triangle(double a,double b) {
        super(a,b);
    }
double show(){
    return (i*j)/2;
    }
public String toString(){
return "Hey";
}
}
/**
 *
 * @author ASHOK
 */
public class AreaDynamicMethodDisp {
    public static void main(String[] args) {
        Figure fig=new Figure(12, 20);
        Rectangle rect=new Rectangle(20, 30);
        Triangle triang=new Triangle(15, 40);
        Figure figref;
        figref=fig;
        System.out.println(figref.show());
        figref=rect;
        System.out.println(figref.show());
        figref=triang;
        System.out.println(figref.show());
    }
}