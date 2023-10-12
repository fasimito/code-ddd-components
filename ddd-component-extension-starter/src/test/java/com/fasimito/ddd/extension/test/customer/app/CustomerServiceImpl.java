package com.fasimito.ddd.extension.test.customer.app;

import com.fasimito.ddd.dto.Response;
import com.fasimito.ddd.dto.SingleResponse;
import com.fasimito.ddd.extension.test.customer.client.AddCustomerCmd;
import com.fasimito.ddd.extension.test.customer.client.CustomerDTO;
import com.fasimito.ddd.extension.test.customer.client.CustomerServiceI;
import com.fasimito.ddd.extension.test.customer.client.GetOneCustomerQry;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class CustomerServiceImpl implements CustomerServiceI {

    @Resource
    private AddCustomerCmdExe addCustomerCmdExe;

    @Resource
    private GetOneCustomerQryExe getOneCustomerQryExe;


    @Override
    public Response addCustomer(AddCustomerCmd addCustomerCmd) {
        return addCustomerCmdExe.execute(addCustomerCmd);
    }

    @Override
    public SingleResponse<CustomerDTO> getCustomer(GetOneCustomerQry getOneCustomerQry) {
        return getOneCustomerQryExe.execute(getOneCustomerQry);
    }
}
