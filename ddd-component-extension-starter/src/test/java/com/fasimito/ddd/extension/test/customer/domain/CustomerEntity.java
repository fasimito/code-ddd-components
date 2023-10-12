package com.fasimito.ddd.extension.test.customer.domain;

import com.fasimito.ddd.domain.Entity;
import com.fasimito.ddd.extension.BizScenario;
import com.fasimito.ddd.extension.ExtensionExecutor;
import com.fasimito.ddd.extension.test.customer.domain.rule.CustomerRuleExtPt;
import com.fasimito.ddd.extension.test.customer.infrastructure.CustomerRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;

@Entity
@Data
public class CustomerEntity {

    private String companyName;
    private SourceType sourceType;
    private CustomerType customerType;
    private BizScenario bizScenario;

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private ExtensionExecutor extensionExecutor;

    public CustomerEntity() {

    }

    public void addNewCustomer() {
        //Add customer policy
        extensionExecutor.execute(CustomerRuleExtPt.class,this.getBizScenario(), extension -> extension.addCustomerCheck(this));

        //Persist customer
        customerRepository.persist(this);

    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public SourceType getSourceType() {
        return sourceType;
    }

    public void setSourceType(SourceType sourceType) {
        this.sourceType = sourceType;
    }

    public CustomerType getCustomerType() {
        return customerType;
    }

    public void setCustomerType(CustomerType customerType) {
        this.customerType = customerType;
    }
}
