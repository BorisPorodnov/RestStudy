package net.porodnov.demoproject.service;

import lombok.extern.slf4j.Slf4j;
import net.porodnov.demoproject.model.Customer;
import net.porodnov.demoproject.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CustomerService {

    Customer getById(Long id);

    void save(Customer customer);

    void delete(Long id);

    List<Customer> getAll();
}
