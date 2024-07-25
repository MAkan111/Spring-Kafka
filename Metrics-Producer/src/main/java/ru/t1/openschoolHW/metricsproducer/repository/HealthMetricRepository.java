package ru.t1.openschoolHW.metricsproducer.repository;

import ru.t1.openschoolHW.metricsproducer.model.HealthMetricEntity;
import org.springframework.data.repository.CrudRepository;

public interface HealthMetricRepository extends CrudRepository<HealthMetricEntity, Long> {
}
