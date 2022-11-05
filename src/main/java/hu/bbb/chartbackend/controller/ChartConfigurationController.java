package hu.bbb.chartbackend.controller;

import hu.bbb.chartbackend.entity.ChartConfigurationEntity;
import hu.bbb.chartbackend.mapper.ChartConfigurationMapper;
import hu.bbb.chartbackend.model.dto.ChartConfigurationDto;
import hu.bbb.chartbackend.repository.ChartRepository;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor(onConstructor_ = @Autowired)
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@RestController
public class ChartConfigurationController {
    ChartRepository chartRepository;
    ChartConfigurationMapper chartConfigurationMapper;

    @PutMapping("/save")
    public ResponseEntity<ChartConfigurationEntity> createChart(@RequestBody ChartConfigurationDto chartConfigurationDto) {
        ChartConfigurationEntity chartConfigurationEntity = chartConfigurationMapper.toEntity(chartConfigurationDto);
        this.chartRepository.save(chartConfigurationEntity);

        return ResponseEntity.ok(chartConfigurationEntity);
    }
}
