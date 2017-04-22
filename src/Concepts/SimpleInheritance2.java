/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Concepts;
class BoxSuper{
private double width;
private double height;
private double depth;
BoxSuper(BoxSuper ob){
width=ob.width;
height=ob.height;
depth=ob.depth;
}
BoxSuper(double w,double h,double d){
width=w;
height=h;
depth=d;
}
BoxSuper(){
width=-1;
height=-1;
depth=-1;
}
double volume(){
return width*height*depth;
}
}
class BoxWeightSub extends BoxSuper{
double weight;

BoxWeightSub(BoxWeightSub ob) {
super(ob);
weight=ob.weight;
}
BoxWeightSub(double w,double h,double d,double m) {
super(w,h,d);
weight=m;
}
BoxWeightSub() {
super();
weight=-1;
}
}

/**
 *
 * @author ASHOK
 */
public class SimpleInheritance2 {
    public static void main(String[] args) {
        BoxWeightSub bwsf=new BoxWeightSub(10, 20, 30, 40);
        BoxWeightSub bwsd=new BoxWeightSub();
        BoxWeightSub myclone=new BoxWeightSub(bwsf);
        double vol;
        vol=bwsf.volume();
        System.out.println(vol);
        System.out.println("bwsf weight : " + bwsf.weight);
        vol=bwsd.volume();
        System.out.println(vol);
        System.out.println("bwsd weight : " + bwsd.weight);
        vol=myclone.volume();
        System.out.println(vol);
        System.out.println("myclone weight : " + myclone.weight);
    }
}