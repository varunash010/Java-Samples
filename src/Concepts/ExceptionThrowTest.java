/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Concepts;


/**
 *
 * @author ASHOK
 */
public class ExceptionThrowTest {
    static void test(){
    try{
    throw new NullPointerException("test");
    }
    catch(ArithmeticException e){
        System.out.println("inside test method" + e);
        throw e;
    }
    }
    public static void main(String[] args ) throws NullPointerException{
        try{
            System.out.println("inside 1st try");
            try{
                throw new NullPointerException("test");
            }
            catch(ArithmeticException x){
                System.out.println("inside 1st catch" + x);
            }
        }
        catch(NullPointerException x){
            System.out.println("inside main" + x);        
        }
    }
}
