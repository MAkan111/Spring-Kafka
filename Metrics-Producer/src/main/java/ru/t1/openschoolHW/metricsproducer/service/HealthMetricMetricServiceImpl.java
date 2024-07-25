package ru.t1.openschoolHW.metricsproducer.service;

import lombok.RequiredArgsConstructor;
import ru.t1.openschoolHW.metricsproducer.dto.HealthMetricDto;
import ru.t1.openschoolHW.metricsproducer.model.HealthMetricEntity;
import ru.t1.openschoolHW.metricsproducer.repository.HealthMetricRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class HealthMetricMetricServiceImpl implements HealthMetricService {

    private final HealthMetricRepository healthMetricRepository;

    @Override
    public HealthMetricEntity createHealthMetric(HealthMetricDto healthMetricDto) {

        HealthMetricEntity healthMetricEntity = new HealthMetricEntity();
        healthMetricEntity.setMetric(healthMetricDto.getMetric());

      return  healthMetricRepository.save(healthMetricEntity);
    }
}
