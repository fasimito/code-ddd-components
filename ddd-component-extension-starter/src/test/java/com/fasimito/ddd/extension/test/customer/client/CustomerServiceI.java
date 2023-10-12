package com.fasimito.ddd.extension.test.customer.client;

import com.fasimito.ddd.dto.Response;
import com.fasimito.ddd.dto.SingleResponse;

public interface CustomerServiceI {
    public Response addCustomer(AddCustomerCmd addCustomerCmd);
    public SingleResponse<CustomerDTO> getCustomer(GetOneCustomerQry getOneCustomerQry);
}
