package com.fasimito.ddd.extension;

import org.springframework.stereotype.Component;

import java.lang.annotation.*;

@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
@Component
public @interface Extensions {

    String[] bizId() default BizScenario.DEFAULT_BIZ_ID;

    String[] useCase() default BizScenario.DEFAULT_USE_CASE;

    String[] scenario() default BizScenario.DEFAULT_SCENARIO;

    Extension[] value() default {};

}
