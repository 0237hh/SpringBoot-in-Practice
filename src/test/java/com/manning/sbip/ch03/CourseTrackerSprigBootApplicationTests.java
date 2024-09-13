package com.manning.sbip.ch03;

import com.manning.sbip.ch02.CourseTrackerApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import javax.sql.DataSource;

@SpringBootTest(classes = CourseTrackerApplication.class)
public class CourseTrackerSprigBootApplicationTests {
    @Autowired
    private DataSource dataSource;
}
