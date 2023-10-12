package com.fasimito.ddd.extension.test.customer.client;


import com.fasimito.ddd.dto.Command;
import com.fasimito.ddd.extension.BizScenario;
import lombok.Data;

@Data
public class AddCustomerCmd extends Command {

    private CustomerDTO customerDTO;

    private String biz;

    private BizScenario bizScenario;
}
