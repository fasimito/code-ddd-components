package com.fasimito.ddd.extension.register;

import com.fasimito.ddd.extension.Extension;
import com.fasimito.ddd.extension.ExtensionPointI;
import com.fasimito.ddd.extension.Extensions;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import java.util.Map;

@Component
public class ExtensionBootstrap implements ApplicationContextAware {

    @Resource
    private ExtensionRegister extensionRegister;

    private ApplicationContext applicationContext;

    @PostConstruct
    public void init(){
        Map<String, Object> extensionBeans = applicationContext.getBeansWithAnnotation(Extension.class);
        extensionBeans.values().forEach(
                extension -> extensionRegister.doRegistration((ExtensionPointI) extension)
        );

        // handle @Extensions annotation
        Map<String, Object> extensionsBeans = applicationContext.getBeansWithAnnotation(Extensions.class);
        extensionsBeans.values().forEach( extension -> extensionRegister.doRegistrationExtensions((ExtensionPointI) extension));
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
