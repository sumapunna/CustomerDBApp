//package com.customer.demo.repository;
//
//import com.customer.demo.model.Customer;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;
//
//@Repository
//public interface CustomerRepository extends JpaRepository<Customer, Long> {
//    // Repository methods (if any)
//}

package com.customer.demo.repository;

import com.customer.demo.model.Customer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@ComponentScan

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    // Repository methods (if any)
}


