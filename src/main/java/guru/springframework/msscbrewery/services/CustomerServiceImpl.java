package guru.springframework.msscbrewery.services;

import guru.springframework.msscbrewery.web.model.CustomerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;
@Service
@Slf4j
public class CustomerServiceImpl implements CustomerService{
    @Override
    public CustomerDto getCustomerById(UUID customerId) {
        return CustomerDto.builder().customerName("cagla").id(UUID.randomUUID()).build();
    }

    @Override
    public CustomerDto save(CustomerDto customerDto) {
        log.warn(customerDto + " is saved!");
        return customerDto;
    }

    @Override
    public void update(UUID customerId, CustomerDto customerDto) {
        log.warn(customerDto + " is updated!");
    }

    @Override
    public void delete(UUID customerId) {
        log.warn(customerId + " is deleted!");
    }
}
