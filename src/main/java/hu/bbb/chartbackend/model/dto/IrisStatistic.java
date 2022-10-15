package hu.bbb.chartbackend.model.dto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class IrisStatistic {
    long count;
    double maxSepalWidth;
    double minSepalWidth;
    double maxPetalWidth;
    double minPetalWidth;

}
