package com.hariSolution.Controller;

import com.hariSolution.Producer.RabbitMQJsonProducer;
import com.hariSolution.Dto.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/json")
public class JsonMessageController {
    private RabbitMQJsonProducer jsonProducer;

    public JsonMessageController(RabbitMQJsonProducer jsonProducer) {
        this.jsonProducer = jsonProducer;
    }
    @PostMapping("/message")
    public String sendJsonMessage(@RequestBody User user){
        jsonProducer.jsonMessageSend(user);
        return "jsonMessage has been send";

    }
}
