package com.fasimito.ddd.catchlog.test;

import com.fasimito.ddd.catchlog.CatchAndLog;
import com.fasimito.ddd.catchlog.CatchLogAspect;
import com.fasimito.ddd.dto.Response;
import com.fasimito.ddd.dto.SingleResponse;
import com.fasimito.ddd.exception.BizException;
import com.fasimito.ddd.exception.SysException;
import lombok.AllArgsConstructor;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Configuration;

@Configuration
@CatchAndLog
public class Demo implements ApplicationContextAware {
    static ApplicationContext applicationContext;

    public void doSomething(){
        System.out.println("Doing something");
        CatchLogAspect catchAndLog = applicationContext.getBean(CatchLogAspect.class);
        System.out.println(catchAndLog);
        doSomethingInner();
    }

    private void doSomethingInner(){
        System.out.println("doSomethingInner");
    }

    public DemoResponse execute(Request request){
        System.out.println("executing request");
        return new DemoResponse(request.name, true);
    }

    public DemoResponse executeWithExceptionAndDemoResponse(){
        if(true){
            throw new RuntimeException("executeWithExceptionAndDemoResponse");
        }
        return null;
    }

    public Response executeWithResponse(Request request){
        DemoResponse demoResponse = new DemoResponse("Jack Ma", true);
        return SingleResponse.of(demoResponse);
    }

    public Response executeWithExceptionAndResponse(){
        if(true){
            throw new RuntimeException("execute With Exception And Response");
        }
        return null;
    }

    public void executeWithVoid(){
        System.out.println("execute with void");
    }

    public void executeWithExceptionAndVoid(){
        if(true){
            throw new BizException("execute With Exception And Void");
        }
    }

    public Response executeWithBizExceptionAndResponse(){
        if(true){
            throw new BizException("execute With BizException And Response");
        }
        return null;
    }

    public Response executeWithSysExceptionAndResponse(){
        if(true){
            throw new SysException("execute With SysException And Response");
        }
        return null;
    }


    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    public static class Request {
        public String name;
        public int  age;
    }

    @AllArgsConstructor
    public static class DemoResponse extends Response{
        public String name;
        public boolean isSuccess;

        public DemoResponse(){

        }
    }
}
