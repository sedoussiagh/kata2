package com.carrefour.kata.model;

import java.util.List;

public class PromotionCode {
  private String code;
  private double discountPercentage;
  private List<String> applicableProductIds;

  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public double getDiscountPercentage() {
    return discountPercentage;
  }

  public void setDiscountPercentage(double discountPercentage) {
    this.discountPercentage = discountPercentage;
  }

  public List<String> getApplicableProductIds() {
    return applicableProductIds;
  }

  public void setApplicableProductIds(List<String> applicableProductIds) {
    this.applicableProductIds = applicableProductIds;
  }
}