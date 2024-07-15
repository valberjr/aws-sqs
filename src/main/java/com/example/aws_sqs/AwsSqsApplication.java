package com.example.aws_sqs;

import com.example.aws_sqs.consumer.MyMessage;
import io.awspring.cloud.sqs.operations.SqsTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AwsSqsApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(AwsSqsApplication.class, args);
    }

    @Autowired
    private SqsTemplate sqsTemplate;

    @Override
    public void run(String... args) throws Exception {
        var SQS = "https://localhost.localstack.cloud:4566/000000000000/my-queue";
        sqsTemplate.send(SQS, new MyMessage("my start value"));
    }
}
