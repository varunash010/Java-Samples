/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Concepts;
class SuperNest{
public interface NestedIF{
boolean isNotNegative(int x);
}
}
class SubNest implements SuperNest.NestedIF{
public boolean isNotNegative(int x){
    return x < 0 ? true:false;
}
}
class NestedInterfaces{
    public static void main(String[] args) {
        SuperNest.NestedIF supnestif=new SubNest();
        System.out.println(supnestif.isNotNegative(10));
    }
}