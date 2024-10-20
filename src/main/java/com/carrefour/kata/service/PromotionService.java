package com.carrefour.kata.service;

import com.carrefour.kata.model.Product;
import com.carrefour.kata.model.PromotionCode;

public class PromotionService {
  public double applyPromotion(Product product, PromotionCode promoCode) {
    if (promoCode.getApplicableProductIds().contains(product.getId())) {
      return product.getPrice() * (1 - promoCode.getDiscountPercentage() / 100);
    }
    return product.getPrice();
  }
}
