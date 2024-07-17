package SportsCourseRegistration;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Merhaba, lutfen formu doldurunuz.");
        System.out.print("Ogrenci Sayisini Giriniz : ");
        int numStd = scan.nextInt();

        String[] students = new String[numStd];
        String[] gender = new String[numStd];
        double[] height = new double[numStd];
        double[] weight = new double[numStd];

        boolean isSuccess = true;
        do {
            isSuccess = true;
            for (int i = 0; i < numStd; i++) {
                System.out.print("Isım : ");
                students[i] = scan.next();

                System.out.print("Cinsiyet : ");
                String gen = scan.next().toUpperCase().substring(0, 1);
                if (gen.equalsIgnoreCase("k") || gen.equalsIgnoreCase("e")) {
                    gender[i] = gen;
                } else {
                    System.out.println("Hatali Giris!");
                    isSuccess = false;
                    break;
                }

                System.out.print("Boy : ");
                height[i] = scan.nextDouble();

                System.out.print("Kilo : ");
                weight[i] = scan.nextDouble();
            }
        } while (!isSuccess);

        int counter  = 0;
        System.out.println("*** KURSA SECILEN OGRENCILER ***");
        for (int i = 0; i < numStd; i++) {
            boolean checkForFemle = gender[i].equalsIgnoreCase("k") && height[i] >= 1.50 && weight[i] >= 50 && weight[i] <= 70;
            boolean checkForMale = gender[i].equalsIgnoreCase("e") && height[i] >= 1.60 && weight[i] >= 70 && weight[i] <= 90;
            if (checkForFemle) {
                System.out.println("Isım : " + students[i] + " Cinsiyet : " + gender[i] + " Boy : " + height[i] + " Kilo : " + weight[i]);
            } else if (checkForMale) {
                System.out.println("Isım : " + students[i] + " Cinsiyet : " + gender[i] + " Boy : " + height[i] + " Kilo : " + weight[i]);
                counter++;
            }
        }

        if (counter == 0){
            System.out.println("Maalesef kurs gereksinimlerini karsilayan ogrenci bulunamadi.");
        }


    }
}
