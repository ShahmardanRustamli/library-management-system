package util;

import java.util.Scanner;

public class InputUtil {
    public static String inputString(String title) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(title);
        return scanner.nextLine();
    }
    public static long inputLong(String title) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(title);
        return scanner.nextInt();
    }
    public static byte inputByte(String title) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(title);
        return scanner.nextByte();
    }
    public static int inputInt(String title) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(title);
        return scanner.nextInt();
    }
    public static double inputDouble(String title) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(title);
        return scanner.nextDouble();
    }
}