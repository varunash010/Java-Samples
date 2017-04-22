/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Concepts;
interface SuperInterface{
void callback(int param);
}
/**
 *
 * @author ASHOK
 */
class SubInterface implements SuperInterface{
public void callback(int a){
    System.out.print(a);
    }
void nonIfacemeth(){
    System.out.println("nonIfaceMeth");
}
}
class SubInterface1 implements SuperInterface{
public void callback(int a){
    System.out.println("Another Interface");
}    
}
public class InterfaceReferences{
    public static void main(String[] args) {
        SuperInterface c=new SubInterface();
        SuperInterface c1=new SubInterface1();
        SuperInterface c3;
        c.callback(15);
        c3=c1;
        c3.callback(20);
    }
}