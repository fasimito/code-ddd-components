package com.fasimito.ddd.extension.test.customer.client;

import com.fasimito.ddd.dto.Query;

public class GetOneCustomerQry extends Query{
    private long customerId;
    private String companyName;

    public long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}
