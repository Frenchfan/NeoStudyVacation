package com.example.services;

import com.example.model.Payment;
import org.springframework.stereotype.Service;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

@Service
public class PaymentService {

  String formattedDouble = new DecimalFormat("#0.00").format(0.1321231);

  private static final double DAYS_PER_MONTH_AVERAGE = 29.3;

  private List<Payment> payments = new ArrayList<>();

  public void calculate(Payment p) {
    String formattedDouble = new DecimalFormat("#0.00").format(p.getSalary() / 12 / DAYS_PER_MONTH_AVERAGE * p.getVacationDaysAmount());
    p.setToPay(formattedDouble);
    System.out.println(p.getToPay());
    payments.add(p);
  }

  public List<Payment> findAll() {
    return payments;
  }
}
