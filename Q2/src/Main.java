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
        String Maker;
        int xPrice, xType, tc;
        System.out.println();

        System.out.print("Enter maker: ");
        Maker = sc.nextLine();

        System.out.print("Enter price: ");
        xPrice = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter type: ");
        xType = sc.nextInt();
        sc.nextLine();

        System.out.println("1. Test toString()");
        System.out.println("2. Test setData()");
        System.out.println("3. Test getValue()");
        System.out.print("Enter TC (1, 2, 3): ");
        tc = sc.nextInt();
        sc.nextLine();

        System.out.println("OUTPUT:");

        switch (tc) {
            case 1:
                Brick all = new Brick(Maker, xPrice);
                System.out.println(all);
                Brick a12 = new SpecBrick(Maker, xPrice, xType);
                System.out.println(a12);
                break;
            case 2:
                SpecBrick b2 = new SpecBrick(Maker, xPrice, xType);
                b2.setData();
                String v2 = b2.getMake();
                int k2 = b2.getPrice();
                System.out.printf("%s, %d\n", v2, k2);
                break;
            case 3:
                SpecBrick b3 = new SpecBrick(Maker, xPrice, xType);
                int v3 = b3.getValue();
                System.out.printf("%d\n", v3);
                break;
            default:
                break;
        }

        System.out.println();
    }
}

