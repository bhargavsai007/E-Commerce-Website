package com.fullstackprojects.springbootecommerce.dto;

import com.fullstackprojects.springbootecommerce.entity.Address;
import com.fullstackprojects.springbootecommerce.entity.Customer;
import com.fullstackprojects.springbootecommerce.entity.Order;
import com.fullstackprojects.springbootecommerce.entity.OrderItem;
import lombok.Data;

import java.util.Set;

@Data
public class Purchase {

    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;

}
