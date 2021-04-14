package net.porodnov.demoproject.repository;

import net.porodnov.demoproject.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Long> {

}
