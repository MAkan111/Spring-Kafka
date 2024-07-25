package ru.t1.openschoolHW.metricsproducer.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import ru.t1.openschoolHW.metricsproducer.dto.HealthMetricDto;
import ru.t1.openschoolHW.metricsproducer.service.HealthMetricService;
import ru.t1.openschoolHW.metricsproducer.service.KafkaProducerService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
@Slf4j
public class KafkaHealthMetricProducerController {

    private final KafkaProducerService kafkaProducerService;
    private final RestTemplate restTemplate;
    private final HealthMetricService healthMetricService;


    @PostMapping("/send-metric")
    public void sendMetric() {
        String healthMetric = restTemplate.getForObject("http://localhost:8080/actuator/health", String.class);
        kafkaProducerService.sendMessage(healthMetric);

        HealthMetricDto metric = new HealthMetricDto();
        metric.setMetric(healthMetric);
        healthMetricService.createHealthMetric(metric);

        log.info("Health metric sent in kafka");
    }
}
