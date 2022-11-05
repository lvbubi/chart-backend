package hu.bbb.chartbackend.model.dto;

import lombok.Data;

import java.util.Map;

@Data
public class ChartConfigurationDto {
    private String type;
    private Map<String, Object> options;
}
