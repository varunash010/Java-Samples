/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Package.p2;
import Package.p1.*;
/**
 *
 * @author ASHOK
 */
public class OtherPackage extends Protection{
int a=10;
    OtherPackage() {
    Protection p1=new Protection();
        //System.out.println(p1.n);
        System.out.println(p1.n_pub);
        //System.out.println(p1.n_pro);
    }    
}