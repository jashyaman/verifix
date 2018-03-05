package com.verifix;

import javax.transaction.Transactional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Transactional
@SpringBootApplication
public class App 
{
    public static void main( String[] args )
    {
       SpringApplication.run(App.class, args);
    		//System.out.println("hello World test timestamp generation" + Timestamp.from(Instant.now()));
    		
    }
}
