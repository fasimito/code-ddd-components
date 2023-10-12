package com.fasimito.ddd.extension.test.customer.app;

import com.fasimito.ddd.dto.Response;
import com.fasimito.ddd.extension.test.customer.client.CustomerCreatedEvent;

public class CustomerCreatedEventHandler {

    public Response execute(CustomerCreatedEvent customerCreatedEvent) {
        System.out.println("customerCreatedEvent processed");
        return null;
    }
}
