package com.carrefour.kata.model;

public class CheckoutRequest {
  private Product product;
  private PromotionCode promoCode;

  public Product getProduct() {
    return product;
  }

  public void setProduct(Product product) {
    this.product = product;
  }

  public PromotionCode getPromoCode() {
    return promoCode;
  }

  public void setPromoCode(PromotionCode promoCode) {
    this.promoCode = promoCode;
  }
}


