package hu.bbb.chartbackend.repository;

import hu.bbb.chartbackend.entity.Chart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChartRepository extends JpaRepository<Chart, Long> {
}