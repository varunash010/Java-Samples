/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASHOK
 */
 class Demo2 {
    public  static String name;
    public String getName(){
    return name;
    }
    public void SetName(String name){
    this.name=name;
    }
}
 
class Demo1{
    public static void main(String[] args) {
        Demo2 d2=new Demo2();
        Demo2 d3=new Demo2();
        d2.SetName("hi");
        System.out.println(Demo2.name);
        System.out.println(d2.name);
        d3.SetName("hello");
        System.out.println(d3.getName());
        d3.SetName("hello1");
        System.out.println(d3.name);
    }
}