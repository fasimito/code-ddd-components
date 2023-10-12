package com.fasimito.ddd.extension.test.customer.app.extensionpoint;

import com.fasimito.ddd.extension.ExtensionPointI;

public interface StatusNameConvertorExtPt extends ExtensionPointI {
    String statusNameConvertor(Integer statusCode);
}
