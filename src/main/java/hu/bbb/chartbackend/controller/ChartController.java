package hu.bbb.chartbackend.controller;

import hu.bbb.chartbackend.entity.ChartEntity;
import hu.bbb.chartbackend.model.dto.ChartDto;
import hu.bbb.chartbackend.repository.ChartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChartController {

    @Autowired
    private ChartRepository chartRepository;

    @PutMapping("/chart")
    public ResponseEntity<ChartEntity> createChart(@RequestBody ChartDto chartDto) {
        ChartEntity chartEntity = new ChartEntity();
        chartEntity.setOptions(chartDto.getOptions());
        chartEntity.setType(chartDto.getType());
        this.chartRepository.save(chartEntity);

        return ResponseEntity.ok(chartEntity);
    }
}
