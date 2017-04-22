/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Concepts;
interface MyIf{
int number();

//default implementation
default String getString(){
return "default string";
}
}
interface myIf2{
    default String getString(){
    return "My IF2 getString";
    }
    static int numb(){
    return 10;
    }
}
/**
 *
 * @author ASHOK
 */
class SubMyIf implements myIf2,MyIf{
    public  int number(){
        return 100;
}
  public String getString(){
  return myIf2.super.getString();
  }
}
public class DefaultIFace{
    public static void main(String[] args) {
        SubMyIf smi=new SubMyIf();
        System.out.println(myIf2.numb());
        System.out.println(smi.getString());
        System.out.println(smi.number());
    }
}
