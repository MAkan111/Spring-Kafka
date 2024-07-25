package ru.t1.opencschoolHW.metricsconsumer.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import ru.t1.opencschoolHW.metricsconsumer.model.HealthMetricEntity;
import ru.t1.opencschoolHW.metricsconsumer.repository.HealthMetricRepository;

@Service
@RequiredArgsConstructor
@Slf4j
public class KafkaListenerService {

    private final HealthMetricRepository healthMetricRepository;

    @KafkaListener(topics = "health-metrics-topic", groupId = "group_id")
    public void listenHealth(String healthMetric) {
        HealthMetricEntity metric = new HealthMetricEntity();
        metric.setMetric(healthMetric);
        healthMetricRepository.save(metric);
        log.info("Received healthMetric: {}", healthMetric);
    }
}
