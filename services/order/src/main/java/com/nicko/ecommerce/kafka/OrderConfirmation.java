package com.nicko.ecommerce.kafka;

import com.nicko.ecommerce.customer.CustomerResponse;
import com.nicko.ecommerce.order.PaymentMethod;
import com.nicko.ecommerce.product.PurchaseResponse;

import java.math.BigDecimal;
import java.util.List;

public record OrderConfirmation (
        String orderReference,
        BigDecimal totalAmount,
        PaymentMethod paymentMethod,
        CustomerResponse customer,
        List<PurchaseResponse> products

) {
}
