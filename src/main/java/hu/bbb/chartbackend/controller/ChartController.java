package hu.bbb.chartbackend.controller;

import hu.bbb.chartbackend.entity.Chart;
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
    public ResponseEntity<Chart> createChart(@RequestBody ChartDto chartDto) {
        Chart chart = new Chart();
        chart.setOptions(chartDto.getOptions());
        chart.setType(chartDto.getType());
        this.chartRepository.save(chart);

        return ResponseEntity.ok(chart);
    }
}
