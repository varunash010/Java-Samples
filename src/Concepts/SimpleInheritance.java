/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Concepts;
class Box{
double width,height,depth;

Box(Box ob){
width=ob.width;
height=ob.height;
depth=ob.depth;
}
Box(double w,double h,double d){
width=w;
height=h;
depth=d;
}
Box(){
width=-10;
height=-1;
depth=-1;
}
Box(double len){
width=height=depth=len;
}
double volume(){
return width*height*depth;
}
}
class BoxWeight extends Box{
double weight;
BoxWeight(double w,double h,double d,double m){
    //super(w,h,d);
weight=m;
}
}
/**
 *
 * @author ASHOK
 */
public class SimpleInheritance {
    public static void main(String[] args) {
    BoxWeight mybox1=new BoxWeight(10, 20, 30, 15);
    BoxWeight mybox2=new BoxWeight(2, 5, 33.12, 4);
    double vol;
    vol=mybox2.volume();
        System.out.println(vol + " " + mybox1.weight);
    }
}
