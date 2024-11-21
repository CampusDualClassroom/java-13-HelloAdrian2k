package com.campusdual.classroom;

public class Exercise13 {
    public static void main(String[] args) {
        FuelTank ft = new FuelTank();
        System.out.println();
        ft.showDetails();
        ft.setActualFuel(-8);
        ft.setActualFuel(19);
        ft.showDetails();
    }
}