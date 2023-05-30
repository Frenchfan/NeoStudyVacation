package com.example.model;

public class Payment {

  private double salary;

  private byte vacationDaysAmount;

  private String toPay;
  public double getSalary() {
    return salary;
  }

  public void setSalary(double salary) {
    this.salary = salary;
  }

  public byte getVacationDaysAmount() {
    return vacationDaysAmount;
  }

  public void setVacationDaysAmount(byte vacationDaysAmount) {
    this.vacationDaysAmount = vacationDaysAmount;
  }

  public String getToPay() {
    return toPay;
  }

  public void setToPay(String toPay) {
    this.toPay = toPay;
  }
}
