package hu.bbb.chartbackend.mapper;

import hu.bbb.chartbackend.entity.ChartConfigurationEntity;
import hu.bbb.chartbackend.model.dto.ChartConfigurationDto;
import org.mapstruct.Mapper;

@Mapper
public interface ChartConfigurationMapper {
    ChartConfigurationEntity toEntity(ChartConfigurationDto dto);
}