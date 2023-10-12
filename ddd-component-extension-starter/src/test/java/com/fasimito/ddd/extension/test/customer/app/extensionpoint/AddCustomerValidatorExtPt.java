package com.fasimito.ddd.extension.test.customer.app.extensionpoint;

import com.fasimito.ddd.extension.ExtensionPointI;
import com.fasimito.ddd.extension.test.customer.client.AddCustomerCmd;

public interface AddCustomerValidatorExtPt extends ExtensionPointI {

    public void validate(AddCustomerCmd addCustomerCmd);
}
