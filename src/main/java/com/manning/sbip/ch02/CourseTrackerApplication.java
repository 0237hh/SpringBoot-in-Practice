package com.manning.sbip.ch02;

import com.manning.sbip.ch02.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import java.util.Set;

@SpringBootApplication
public class CourseTrackerApplication implements CommandLineRunner {
    protected final Logger logger = LoggerFactory.getLogger(CourseTrackerApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(CourseTrackerApplication.class, args);
    }

    @Override
    public void run(String ...args) throws Exception {
        User user1 = new User("sbip01", "sbip");

        Validator validator = Validation.buildDefaultValidatorFactory().getValidator();
        Set<ConstraintViolation<User>> violations = validator.validate(user1);

        logger.error ("Password for user1 do not adhere to the password policy");

        violations.forEach(constraintViolation -> logger.error("Violation details: [{}].", constraintViolation.getMessage()));
        if (!violations.isEmpty()) {
            logger.info("Password for user2 adhere to the password policy");
        }

        User user2 = new User("sbip02", "Sbip01$4UDfg");
        violations = validator.validate(user2);
        if(!violations.isEmpty()) {
            logger.info("Password for user2 do not adhere to the password policy");
        }
        User user3 = new User("sbip03", "Sbip014UDfgggg");
        violations = validator.validate(user3);
        logger.error ("Password for user3 do not adhere to the password policy");
        violations.forEach(constraintViolation -> logger.error("Violation details: [{}].", constraintViolation.getMessage()));

        User user4 = new User("sbip04", "Sbip014UDfgggg");
        violations = validator.validate(user4);
        logger.error ("Password for user4 do not adhere to the password policy");
        violations.forEach(userConstraintViolation -> logger.error("Violation details: [{}].", userConstraintViolation.getMessage()));
    }
//
//    @Bean
//    public CommandLineRunner commandLineRunner() {
//        return args -> {
//            logger.info("CommandLine Runnr executed as a bean definition with " + args.length + " arguments");
//
//            for (int i = 0; i < args.length; i++) {
//                logger.info("Argument: "+ args[i]);
//            }
//        };
//    }
//
//    @Override
//    public void run(String... args) throws Exception {
//
//    }
}
