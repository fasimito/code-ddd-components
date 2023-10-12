package com.fasimito.ddd.extension.test.customer.domain.rule;

import com.fasimito.ddd.exception.BizException;
import com.fasimito.ddd.extension.Extension;
import com.fasimito.ddd.extension.test.customer.client.Constants;
import com.fasimito.ddd.extension.test.customer.domain.CustomerEntity;
import com.fasimito.ddd.extension.test.customer.domain.SourceType;

@Extension(bizId = Constants.BIZ_1)
public class CustomerBizOneRuleExt implements CustomerRuleExtPt{

    @Override
    public boolean addCustomerCheck(CustomerEntity customerEntity) {
        if(SourceType.AD == customerEntity.getSourceType()){
            throw new BizException("Sorry, Customer from advertisement can not be added in this period");
        }
        return true;
    }
}
