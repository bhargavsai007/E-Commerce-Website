package com.fullstackprojects.springbootecommerce.service;

import com.fullstackprojects.springbootecommerce.dto.Purchase;
import com.fullstackprojects.springbootecommerce.dto.PurchaseResponse;

public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);
}
