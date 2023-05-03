package guru.springframework.msscbrewery.mappers;

import guru.springframework.domain.Customer;
import guru.springframework.msscbrewery.web.model.CustomerDto;
import org.mapstruct.Mapper;

@Mapper
public interface CustomerMapper {

    CustomerDto cutomerTocustomerDto(Customer customer);

    Customer customerDtoToCustomer(CustomerDto customerDto);

}
