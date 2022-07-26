/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overloading1;

/**
 *
 * @author ACER
 */

import java.util.Scanner;

public class perhitungan {
    
    public void perhitungan(int a, int b){
        
         Scanner input = new Scanner(System.in);
        
        System.out.print(" masuk kan nilai a = ");
    a = input.nextInt();
        
        System.out.print(" masuk kan nilai b = ");
    b = input.nextInt();
    
            System.out.println(a+b);
    }
    
}
