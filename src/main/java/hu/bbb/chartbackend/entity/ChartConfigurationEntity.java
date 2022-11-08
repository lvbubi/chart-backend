package hu.bbb.chartbackend.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class ChartConfigurationEntity {
    @Id
    @SequenceGenerator(name="seq",sequenceName="oracle_seq")
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator="seq")
    private Long id;
    @Column
    private String type;
    @Column
    private ChartOptions chartOptions;
}
