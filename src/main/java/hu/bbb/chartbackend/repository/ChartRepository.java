package hu.bbb.chartbackend.repository;

import hu.bbb.chartbackend.entity.ChartEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChartRepository extends JpaRepository<ChartEntity, Long> {
}