package com.hariSolution.Consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class RabbiMQConsumer {

    private static  final Logger LOGGER= LoggerFactory.getLogger(RabbiMQConsumer.class);

    @RabbitListener(queues = "${rabbitmq.queue.name}")
    public void consumer(String message){
        LOGGER.info(String.format("Received message->%s",message));
    }
}
