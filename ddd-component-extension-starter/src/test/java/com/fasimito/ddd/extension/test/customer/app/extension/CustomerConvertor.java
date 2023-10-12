package com.fasimito.ddd.extension.test.customer.app.extension;

import com.fasimito.ddd.domain.ApplicationContextHelper;
import com.fasimito.ddd.extension.test.customer.client.AddCustomerCmd;
import com.fasimito.ddd.extension.test.customer.client.CustomerDTO;
import com.fasimito.ddd.extension.test.customer.domain.CustomerEntity;
import org.springframework.stereotype.Component;

@Component
public class CustomerConvertor{

    public CustomerEntity clientToEntity(Object clientObject){
        AddCustomerCmd addCustomerCmd = (AddCustomerCmd)clientObject;
        CustomerDTO customerDTO =addCustomerCmd.getCustomerDTO();
        CustomerEntity customerEntity = (CustomerEntity) ApplicationContextHelper.getBean(CustomerEntity.class);
        customerEntity.setCompanyName(customerDTO.getCompanyName());
        customerEntity.setCustomerType(customerDTO.getCustomerType());
        customerEntity.setBizScenario(addCustomerCmd.getBizScenario());
        return customerEntity;
    }
}
