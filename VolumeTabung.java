package UKL;

import java.util.Scanner;

import java.util.Scanner;

public class VolumeTabung {
    static double hitungVolume(double jarijari, double tinggi) {
        double volume = 3.14 * jarijari * jarijari * tinggi;
        return volume;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jari-jari tabung: ");
        double jarijari = input.nextDouble();
        System.out.print("Masukkan tinggi tabung: ");
        double tinggi = input.nextDouble();

        double volume = hitungVolume(jarijari, tinggi);
        System.out.println("Volume tabung adalah: " + volume);
    }
}

