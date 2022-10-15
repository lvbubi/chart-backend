package hu.bbb.chartbackend.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class ChartEntity {

    @Id
    @SequenceGenerator(name="seq",sequenceName="oracle_seq")
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator="seq")
    private Long id;

    private String type;

    @Column(length = 10000)
    private String options;
}
