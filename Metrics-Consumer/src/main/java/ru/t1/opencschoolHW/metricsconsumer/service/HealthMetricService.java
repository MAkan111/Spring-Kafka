package ru.t1.opencschoolHW.metricsconsumer.service;

import org.springframework.transaction.annotation.Transactional;
import ru.t1.opencschoolHW.metricsconsumer.model.HealthMetricEntity;

import java.util.Optional;

public interface HealthMetricService {
    Iterable<HealthMetricEntity> getAllHealthMetrics();

    @Transactional
    Optional<HealthMetricEntity> getById(Long id);
}
