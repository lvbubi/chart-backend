package hu.bbb.chartbackend.controller;

import hu.bbb.chartbackend.entity.IrisEntity;
import hu.bbb.chartbackend.model.dto.IrisDto;
import hu.bbb.chartbackend.model.dto.IrisStatistic;
import hu.bbb.chartbackend.repository.IrisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static hu.bbb.chartbackend.entity.IrisEntity.*;

@RestController
public class IrisController {

    @Autowired
    private IrisRepository irisRepository;

    @GetMapping("/iris")
    public ResponseEntity<List<IrisDto>> getAllIrises() {
        List<IrisEntity> irisEntities = irisRepository.findAll();

        return ResponseEntity.ok(List.of(
                createIrisDto(irisEntities, IRIS_SETOSA),
                createIrisDto(irisEntities, IRIS_VERSICOLOR),
                createIrisDto(irisEntities, IRIS_VIRGINICA)
        ));
    }

    private IrisDto createIrisDto(List<IrisEntity> irisEntities, String irisType) {
        long count = irisEntities.stream()
                .filter(irisEntity -> irisEntity.getName().equals(irisType))
                .count();

        double maxSepalWidth = irisEntities.stream()
                .filter(irisEntity -> irisEntity.getName().equals(irisType))
                .mapToDouble(IrisEntity::getSepalWidth)
                .max().getAsDouble();

        double minSepalWidth = irisEntities.stream()
                .filter(irisEntity -> irisEntity.getName().equals(irisType))
                .mapToDouble(IrisEntity::getSepalWidth)
                .min().getAsDouble();
        double maxPetalWidth = irisEntities.stream()
                .filter(irisEntity -> irisEntity.getName().equals(irisType))
                .mapToDouble(IrisEntity::getPetalWidth)
                .max().getAsDouble();
        double minPetalWidth = irisEntities.stream()
                .filter(irisEntity -> irisEntity.getName().equals(irisType))
                .mapToDouble(IrisEntity::getPetalWidth)
                .min().getAsDouble();

        IrisStatistic irisStatistic = IrisStatistic.builder()
                .count(count)
                .maxPetalWidth(maxPetalWidth)
                .minPetalWidth(minPetalWidth)
                .maxSepalWidth(maxSepalWidth)
                .minSepalWidth(minSepalWidth)
                .build();

        return IrisDto.builder()
                .name(irisType)
                .statistic(irisStatistic)
                .build();
    }
}
