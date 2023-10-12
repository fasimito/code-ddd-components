package com.fasimito.ddd.extension.test.customer.app.extensionpoint;

import com.fasimito.ddd.extension.ExtensionPointI;
import com.fasimito.ddd.extension.test.customer.client.AddCustomerCmd;
import com.fasimito.ddd.extension.test.customer.domain.CustomerEntity;

public interface CustomerConvertorExtPt extends ExtensionPointI {

    public CustomerEntity clientToEntity(AddCustomerCmd addCustomerCmd);
}
