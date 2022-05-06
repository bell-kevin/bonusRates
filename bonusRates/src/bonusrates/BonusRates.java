/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bonusrates;

import java.util.Scanner;

/**
 *
 * @author 4800590195
 */
public class BonusRates {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print("Bonus Rates by Kevin Bell \n");
        Scanner computerKeyboardInput = new Scanner(System.in);
        int yearsOfService;
        int salesTotal;
        int bonusRate = 0;
        System.out.print("Enter employee's years of service: ");
        yearsOfService = computerKeyboardInput.nextInt();
        System.out.print("Enter employee's sales total: ");
        salesTotal = computerKeyboardInput.nextInt();
        if (yearsOfService > 10 || salesTotal > 250000) {
            bonusRate = 2;
        } else if (yearsOfService > 5 || salesTotal > 125000) {
            bonusRate = 1;
        } else {
            bonusRate = 100;
        }
        System.out.print("bonus rate = " + bonusRate + "\n");
    }
}
