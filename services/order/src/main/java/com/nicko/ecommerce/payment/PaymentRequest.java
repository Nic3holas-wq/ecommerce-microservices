package com.nicko.ecommerce.payment;

import com.nicko.ecommerce.customer.CustomerResponse;
import com.nicko.ecommerce.order.PaymentMethod;

import java.math.BigDecimal;

public record PaymentRequest(
    BigDecimal amount,
    PaymentMethod paymentMethod,
    Integer orderId,
    String orderReference,
    CustomerResponse customer
) {
}
