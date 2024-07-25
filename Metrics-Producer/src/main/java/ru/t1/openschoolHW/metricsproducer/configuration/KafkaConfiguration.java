package ru.t1.openschoolHW.metricsproducer.configuration;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KafkaConfiguration {

    @Bean
    public NewTopic newTopic() {
        return new NewTopic(
                "health-metrics-topic",
                1,
                (short) 1
        );
    }
}
