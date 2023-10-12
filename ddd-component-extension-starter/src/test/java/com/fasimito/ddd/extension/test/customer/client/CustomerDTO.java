package com.fasimito.ddd.extension.test.customer.client;

import com.fasimito.ddd.dto.DTO;
import com.fasimito.ddd.extension.test.customer.domain.CustomerType;

public class CustomerDTO extends DTO {

    private String companyName;
    private String source;  //advertisement, p4p, RFQ, ATM
    private CustomerType customerType; //potential, intentional, important, vip

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public CustomerType getCustomerType() {
        return customerType;
    }

    public void setCustomerType(CustomerType customerType) {
        this.customerType = customerType;
    }
}
