package org.example;

import java.util.*;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature (in C): ");
        double temperatureCelsius = sc.nextDouble();
        double temperatureFahrenheit = temperatureCelsius * 9 / 5 + 32;
        System.out.printf("Temperature in Fahrenheit: %.2f", temperatureFahrenheit);

    }
}