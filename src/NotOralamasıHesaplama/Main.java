package NotOralamasıHesaplama;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int fizik = getValidGrade(input, "Fizik notunuz: ");
        int matematik = getValidGrade(input, "Matematik notunuz: ");
        int turkce = getValidGrade(input, "Türkçe notunuz: ");
        int kimya = getValidGrade(input, "Kimya notunuz: ");
        int muzik = getValidGrade(input, "Müzik notunuz: ");
        int tarih = getValidGrade(input, "Tarih notunuz: ");

        double avg = calculateAverage(fizik, matematik, turkce, kimya, muzik, tarih);
        System.out.println("Not Ortalamanız : " + avg);
    }

    public static int getValidGrade(Scanner input, String prompt) {
        int grade = -1;
        boolean valid = false;
        while (!valid) {
            System.out.print(prompt);
            if (input.hasNextInt()) {
                grade = input.nextInt();
                if (grade >= 0 && grade <= 100) {
                    valid = true;
                } else {
                    System.out.println("Lütfen 0 ile 100 arasında bir not giriniz.");
                }
            } else {
                System.out.println("Geçersiz giriş. Lütfen bir sayı giriniz.");
                input.next();
            }
        }
        return grade;
    }

    public static double calculateAverage(int fizik, int matematik, int turkce, int kimya, int muzik, int tarih){
        int sum = fizik + matematik + turkce + kimya + muzik + tarih;
        double average = sum / 6.0;
        return average;
    }
}
