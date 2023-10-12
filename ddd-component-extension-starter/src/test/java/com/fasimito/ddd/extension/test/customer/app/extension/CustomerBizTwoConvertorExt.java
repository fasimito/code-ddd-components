package com.fasimito.ddd.extension.test.customer.app.extension;

import com.fasimito.ddd.extension.Extension;
import com.fasimito.ddd.extension.test.customer.app.extensionpoint.CustomerConvertorExtPt;
import com.fasimito.ddd.extension.test.customer.client.AddCustomerCmd;
import com.fasimito.ddd.extension.test.customer.client.Constants;
import com.fasimito.ddd.extension.test.customer.domain.CustomerEntity;
import com.fasimito.ddd.extension.test.customer.domain.SourceType;
import org.springframework.beans.factory.annotation.Autowired;

@Extension(bizId = Constants.BIZ_2)
public class CustomerBizTwoConvertorExt implements CustomerConvertorExtPt {

    @Autowired
    private CustomerConvertor customerConvertor;//Composite basic convertor to do basic conversion

    @Override
    public CustomerEntity clientToEntity(AddCustomerCmd addCustomerCmd){
        CustomerEntity customerEntity = customerConvertor.clientToEntity(addCustomerCmd);
        //In this business, if customers from RFQ and Advertisement are both regarded as Advertisement
        if(Constants.SOURCE_AD.equals(addCustomerCmd.getCustomerDTO().getSource()) || Constants.SOURCE_RFQ.equals(addCustomerCmd.getCustomerDTO().getSource()))
        {
            customerEntity.setSourceType(SourceType.AD);
        }
        return customerEntity;
    }

}
