package hu.bbb.chartbackend.repository;

import hu.bbb.chartbackend.entity.ChartConfigurationEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChartRepository extends JpaRepository<ChartConfigurationEntity, Long> {
}