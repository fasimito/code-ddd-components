package com.fasimito.ddd.extension.register;

import com.fasimito.ddd.extension.Extension;

import org.springframework.stereotype.Component;

@Extension(bizId = "B")
@Component
public class SomeExtensionB implements SomeExtPt {

    @Override
    public void doSomeThing() {
        System.out.println("SomeExtensionB::doSomething");
    }
    
}
