package cn.acyou.kafka.demo.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

/**
 * @author youfang
 * @version [1.0.0, 2020/9/18]
 **/
@Component
public class DemoListener {
    private static final Logger log= LoggerFactory.getLogger(DemoListener.class);

    //声明consumerID为demo，监听topicName为topic.quick.demo的Topic
    @KafkaListener(id = "demo", topics = "topic.quick.demo")
    public void listen(String msgData) {
        log.info("demo receive : "+msgData);
    }
}
