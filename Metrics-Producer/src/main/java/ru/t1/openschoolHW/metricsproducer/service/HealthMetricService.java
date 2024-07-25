package ru.t1.openschoolHW.metricsproducer.service;

import ru.t1.openschoolHW.metricsproducer.dto.HealthMetricDto;
import ru.t1.openschoolHW.metricsproducer.model.HealthMetricEntity;
import org.springframework.transaction.annotation.Transactional;

public interface HealthMetricService {

    @Transactional
    HealthMetricEntity createHealthMetric(HealthMetricDto healthMetricDto);
}
