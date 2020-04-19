package com.hibernate.orminboot;
//import java.util.List;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
//import com.hibernate.orminboot.model.Alien;
@Aspect
@Component
public class LoggingAspect {

    private static final Logger LOGGER =LoggerFactory.getLogger(LoggingAspect.class);

    //@Before("execution(public java.util.List<com.hibernate.orminboot.model.Alien> com.hibernate.orminboot..AlienController.getAliens())")
    @Before("execution(public * com.hibernate.orminboot..AlienController.getAliens())")
    public void logBefore(){
        LOGGER.info("getAliens method called from Aspect showing AOP Before method..");
    }

    //This is afterFinally which will get executed even after exception
    /*@After("execution(public * com.hibernate.orminboot..AlienController.getAliens())")
    public void logAfter(){
        LOGGER.info("getAliens executed successfully...");
    }*/

    //This will get only called after successful returning
    @AfterReturning("execution(public * com.hibernate.orminboot..AlienController.getAliens())")
    public void logAfter(){
        LOGGER.info("getAliens executed successfully...");
    }

    //AfterThrowing is used to run after an exception
}
