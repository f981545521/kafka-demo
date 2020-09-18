package cn.acyou.kafka.demo.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 可以说使用SpringBoot创建Topic是一件非常简单的事情。
 * 首先我们在config包下创建KafkaInitialConfiguration类，注册一个类型为NewTopic的Bean即可。
 * @author youfang
 * @version [1.0.0, 2020/9/18]
 **/
@Configuration
public class KafkaInitialConfiguration {

    //创建TopicName为topic.quick.initial的Topic并设置分区数为8以及副本数为1
    @Bean
    public NewTopic initialTopic() {
        return new NewTopic("topic.quick.initial", 8, (short) 1);
    }
}