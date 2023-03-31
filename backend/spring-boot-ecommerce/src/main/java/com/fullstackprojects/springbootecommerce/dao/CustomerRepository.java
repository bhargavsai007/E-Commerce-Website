package com.fullstackprojects.springbootecommerce.dao;

import com.fullstackprojects.springbootecommerce.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
