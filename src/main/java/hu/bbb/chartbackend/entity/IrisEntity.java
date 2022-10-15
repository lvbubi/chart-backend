package hu.bbb.chartbackend.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity(name = "iris")
public class IrisEntity {
    public static final String IRIS_SETOSA = "Iris-setosa";
    public static final String IRIS_VERSICOLOR = "Iris-versicolor";
    public static final String IRIS_VIRGINICA = "Iris-virginica";

    @Id
    private Long id;
    private String name;
    private double sepalWidth;
    private double sepalLength;
    private double petalLength;
    private double petalWidth;
}
