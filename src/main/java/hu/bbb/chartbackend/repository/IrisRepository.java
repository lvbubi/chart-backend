package hu.bbb.chartbackend.repository;

import hu.bbb.chartbackend.entity.IrisEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IrisRepository extends JpaRepository<IrisEntity, Long> {
}