/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PIGA
 */
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String xTitle;
        int xPrice, xPrice2, tc; 
        xPrice2 = 0;

        System.out.println();
        System.out.print("Enter title: ");
        xTitle = sc.nextLine(); 

        System.out.print("Enter price: ");
        xPrice = sc.nextInt();
        sc.nextLine();

        System.out.println("1. Test getTitle()");
        System.out.println("2. Test setPrice()");
        System.out.print("Enter TC (1 or 2): ");
        tc = sc.nextInt();
        sc.nextLine();

        Book t = new Book(xTitle, xPrice);

        if (tc == 2) {
            System.out.print("Enter new price: ");
            xPrice2 = sc.nextInt();
            sc.nextLine();
            t.setPrice(xPrice2);
        }

        System.out.println("OUTPUT: ");

        switch (tc) {
            case 1:
                String u = t.getTitle();
                System.out.println(u);
                break;
            case 2:
                int v = t.getPrice();
                System.out.println(v);
                break;
            default:
                return;
        }

        System.out.println();
    }
}


