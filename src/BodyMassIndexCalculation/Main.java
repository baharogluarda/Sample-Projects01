package BodyMassIndexCalculation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen Boyunuzu (metre cinsinden) giriniz : ");
        double height = scan.nextDouble();

        System.out.print("Lutfen Kilonuzu giriniz : ");
        double weight = scan.nextDouble();

        double index = weight / (height * height);
        System.out.println("Body Mass Index = " + index);

    }
}
