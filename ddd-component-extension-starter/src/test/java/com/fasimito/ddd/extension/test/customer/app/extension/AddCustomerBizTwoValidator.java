package com.fasimito.ddd.extension.test.customer.app.extension;

import com.fasimito.ddd.exception.BizException;
import com.fasimito.ddd.extension.Extension;
import com.fasimito.ddd.extension.test.customer.client.AddCustomerCmd;
import com.fasimito.ddd.extension.test.customer.client.Constants;
import com.fasimito.ddd.extension.test.customer.app.extensionpoint.AddCustomerValidatorExtPt;

@Extension(bizId = Constants.BIZ_2)
public class AddCustomerBizTwoValidator implements AddCustomerValidatorExtPt {

    public void validate(AddCustomerCmd addCustomerCmd) {
        //For BIZ TWO CustomerTYpe could not be null
        if (addCustomerCmd.getCustomerDTO().getCustomerType() == null)
            throw new BizException("CustomerType could not be null");
    }
}
