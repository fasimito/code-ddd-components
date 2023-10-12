package com.fasimito.ddd.extension.test.customer.domain.rule;

import com.fasimito.ddd.extension.ExtensionPointI;
import com.fasimito.ddd.extension.test.customer.domain.CustomerEntity;

public interface CustomerRuleExtPt extends ExtensionPointI {

    //Different business check for different biz
    public boolean addCustomerCheck(CustomerEntity customerEntity);

    //Different upgrade policy for different biz
    default public void customerUpgradePolicy(CustomerEntity customerEntity){
        //Nothing special
    }
}
