package com.example.controllers;

import com.example.model.Payment;
import com.example.services.PaymentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PaymentsController {

  private final PaymentService paymentService;

  public PaymentsController(PaymentService paymentService) {
    this.paymentService = paymentService;
  }

  @GetMapping("/calc")
  public String viewProducts(Model model) {
    var payments = paymentService.findAll();
    model.addAttribute("payments", payments);

    return "calc.html";
  }

  @PostMapping("/calc")
  public String addProduct(
      @RequestParam double salary,
      @RequestParam byte vacationDaysAmount,
      Model model
  ) {
    Payment p = new Payment();
    p.setSalary(salary);
    p.setVacationDaysAmount(vacationDaysAmount);
    paymentService.calculate(p);

    var payments = paymentService.findAll();
    model.addAttribute("payments", payments);

    return "calc.html";
  }
}
