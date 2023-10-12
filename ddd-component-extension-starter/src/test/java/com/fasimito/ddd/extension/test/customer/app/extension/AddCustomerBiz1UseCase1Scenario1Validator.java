package com.fasimito.ddd.extension.test.customer.app.extension;

import com.fasimito.ddd.extension.Extension;
import com.fasimito.ddd.extension.test.customer.client.AddCustomerCmd;
import com.fasimito.ddd.extension.test.customer.client.Constants;
import com.fasimito.ddd.extension.test.customer.app.extensionpoint.AddCustomerValidatorExtPt;

@Extension(bizId = Constants.BIZ_1, useCase = Constants.USE_CASE_1, scenario = Constants.SCENARIO_1)
public class AddCustomerBiz1UseCase1Scenario1Validator implements AddCustomerValidatorExtPt {
    public void validate(AddCustomerCmd addCustomerCmd) {
        System.out.println("Do validation for Biz_One's Use_Case_One's Scenario_One");
    }
}
