package com.carrefour.kata.controller;

import com.carrefour.kata.model.CheckoutRequest;
import com.carrefour.kata.service.PromotionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/checkout")
public class CheckoutController {

  @Autowired
  private PromotionService promotionService;

  @PostMapping("/apply-promotion")
  public ResponseEntity<Double> applyCode(@RequestBody CheckoutRequest request) {
    double finalPrice = promotionService.applyPromotion(request.getProduct(), request.getPromoCode());
    return ResponseEntity.ok(finalPrice);
  }
}
