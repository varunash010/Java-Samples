/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Concepts;
interface CallBack{
void callback(int param);
}
/**
 *
 * @author ASHOK
 */
class Interface implements CallBack{
public void callback(int a){
    System.out.print(a);
    }
void nonIfacemeth(){
    System.out.println("nonIfaceMeth");
}
}
class AnotherInterface implements CallBack{
public void callback(int a){
    System.out.println("Another Interface");
}    
}
public class InterfaceSample{
    public static void main(String[] args) {
        CallBack c=new Interface();
        CallBack c1=new AnotherInterface();
        CallBack c3;
        c.callback(15);
    }
}