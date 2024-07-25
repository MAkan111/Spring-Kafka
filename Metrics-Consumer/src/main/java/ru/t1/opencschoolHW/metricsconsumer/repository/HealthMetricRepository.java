package ru.t1.opencschoolHW.metricsconsumer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.t1.opencschoolHW.metricsconsumer.model.HealthMetricEntity;

@Repository
public interface HealthMetricRepository extends JpaRepository<HealthMetricEntity, Long> {
}
