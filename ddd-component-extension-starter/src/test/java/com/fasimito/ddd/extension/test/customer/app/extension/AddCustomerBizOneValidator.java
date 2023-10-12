package com.fasimito.ddd.extension.test.customer.app.extension;

import com.fasimito.ddd.exception.BizException;
import com.fasimito.ddd.extension.Extension;
import com.fasimito.ddd.extension.test.customer.client.AddCustomerCmd;
import com.fasimito.ddd.extension.test.customer.client.Constants;
import com.fasimito.ddd.extension.test.customer.domain.CustomerType;
import com.fasimito.ddd.extension.test.customer.app.extensionpoint.AddCustomerValidatorExtPt;

@Extension(bizId = Constants.BIZ_1)
public class AddCustomerBizOneValidator implements AddCustomerValidatorExtPt {

    public void validate(AddCustomerCmd addCustomerCmd) {
        //For BIZ TWO CustomerTYpe could not be VIP
        if(CustomerType.VIP == addCustomerCmd.getCustomerDTO().getCustomerType())
            throw new BizException("Customer Type could not be VIP for Biz One");
    }
}
