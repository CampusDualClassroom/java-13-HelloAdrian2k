package com.campusdual.classroom;

public class FuelTank {

  private int actualFuel = 10;

  public int getActualFuel() {
    return this.actualFuel;
  }

  public void setActualFuel(int actualFuel){
    if(actualFuel >= 0){
      this.actualFuel = actualFuel;
      System.out.println("Capacidad actualizada a " + this.getActualFuel() + " litros.");
    }else{
      System.out.println("No se puede introducir una capacidad negativa.");
    }
  }

  public void showDetails() {
    System.out.println("La capacidad actual es de " + getActualFuel() + " litros.");
  }

}
