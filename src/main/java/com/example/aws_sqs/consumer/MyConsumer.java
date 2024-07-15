package com.example.aws_sqs.consumer;

import io.awspring.cloud.sqs.annotation.SqsListener;
import org.springframework.stereotype.Component;

@Component
public class MyConsumer {

    @SqsListener("my-queue")
    public void listen(MyMessage message) {
        System.out.println("Message received: " + message.content());
    }
}
