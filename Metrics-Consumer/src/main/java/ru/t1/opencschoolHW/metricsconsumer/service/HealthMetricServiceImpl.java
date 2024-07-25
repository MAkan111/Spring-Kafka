package ru.t1.opencschoolHW.metricsconsumer.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import ru.t1.opencschoolHW.metricsconsumer.model.HealthMetricEntity;
import ru.t1.opencschoolHW.metricsconsumer.repository.HealthMetricRepository;

import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
public class HealthMetricServiceImpl implements HealthMetricService {

    private final HealthMetricRepository healthMetricRepository;

    @Override
    public Iterable<HealthMetricEntity> getAllHealthMetrics() {
        return healthMetricRepository.findAll();
    }

    @Override
    public Optional<HealthMetricEntity> getById(Long id) {
        log.info("Health metric get by id: {}", id);
        Optional<HealthMetricEntity> healthMetric = healthMetricRepository.findById(id);
        log.info("Health metric get record received: {}", healthMetric);
        return healthMetric;
    }
}
