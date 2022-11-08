package org.example;
import java.util.Scanner;

public class CarInput {
    public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    System.out.print("Введите производителя авто: ");
    String carManufacture = in.nextLine();
    System.out.printf("Производитель: " + carManufacture + "\nВведите модель авто: ");
    String carModel = in.nextLine();
    System.out.printf("Модель: " + carModel + "\nВведите цвет авто: ");
    String carColor = in.nextLine();
    System.out.printf("Цвет: " + carColor + "\nВведите VIN авто: ");
    String carVin = in.nextLine();
    System.out.printf("VIN: " + carVin);
    in.close();
    }
}
