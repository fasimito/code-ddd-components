package com.fasimito.ddd.extension.test.customer.domain.rule;

import com.fasimito.ddd.extension.Extension;
import com.fasimito.ddd.extension.test.customer.client.Constants;
import com.fasimito.ddd.extension.test.customer.domain.CustomerEntity;

@Extension(bizId = Constants.BIZ_2)
public class CustomerBizTwoRuleExt implements CustomerRuleExtPt{

    @Override
    public boolean addCustomerCheck(CustomerEntity customerEntity) {
        //Any Customer can be added
        return true;
    }
}
