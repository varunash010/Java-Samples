/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package samples;

/**
 *
 * @author ASHOK
 */
public class PrimeNumber {
    public static void main(String[] args) {
          int num;
          boolean isPrime;
          num=19;
          if(num<2) isPrime=false;
          else
              isPrime=true;
          for(int i=2;i<=num/i;i++){
          if((num%i)==0){
          isPrime=false;
          break;
          }
          System.out.println(num%i);
          }
          System.out.println(isPrime);
}
