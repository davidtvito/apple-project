package com.example.apple_project.model;


import javax.persistence.*;
import javax.validation.constraints.*;
import org.hibernate.validator.constraints.Length;
import java.io.Serializable;

@Entity
@Table(name = "iphone")
public class Iphone implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotBlank
    @Length(min = 3, max = 30)
    private String model;

    @NotBlank
    @Length(min = 3, max = 30)
    private String color;

    @Min(64)
    @Max(1024)
    private Integer storageGb;

    @Min(1)
    @Max(10)
    private Integer cameraCount;

    @Min(2000)
    @Max(6000)
    private Integer batteryMah;

    @NotNull
    private Double price;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getStorageGb() {
        return storageGb;
    }

    public void setStorageGb(Integer storageGb) {
        this.storageGb = storageGb;
    }

    public Integer getCameraCount() {
        return cameraCount;
    }

    public void setCameraCount(Integer cameraCount) {
        this.cameraCount = cameraCount;
    }

    public Integer getBatteryMah() {
        return batteryMah;
    }

    public void setBatteryMah(Integer batteryMah) {
        this.batteryMah = batteryMah;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Iphone() {}

    public Iphone(String model, String color, Integer storageGb, Integer cameraCount,
                  Integer batteryMah, Double price) {
        this.model = model;
        this.color = color;
        this.storageGb = storageGb;
        this.cameraCount = cameraCount;
        this.batteryMah = batteryMah;
        this.price = price;
    }
}

