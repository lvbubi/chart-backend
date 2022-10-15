package hu.bbb.chartbackend.model.dto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class IrisDto {
    String name;
    IrisStatistic statistic;
}
