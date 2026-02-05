package com.example.apple_project.dto;


import com.example.apple_project.model.Iphone;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

public class IphoneIn implements Serializable {

    @NotBlank
    @Length(min = 3, max = 30)
    private String model;

    @NotBlank @Length(min = 3, max = 30)
    private String color;

    @Min(64) @Max(1024)
    private Integer storageGb;

    @Min(1) @Max(10)
    private Integer cameraCount;

    @Min(2000) @Max(6000)
    private Integer batteryMah;

    @NotNull
    private Double price;

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

    public Iphone toIphone(IphoneIn iphoneIn) {
        return new Iphone(
                iphoneIn.getModel(),
                iphoneIn.getColor(),
                iphoneIn.getStorageGb(),
                iphoneIn.getCameraCount(),
                iphoneIn.getBatteryMah(),
                iphoneIn.getPrice()
        );
    }

    public void updateIphone(Iphone iphone) {
        iphone.setModel(model);
        iphone.setColor(color);
        iphone.setStorageGb(storageGb);
        iphone.setCameraCount(cameraCount);
        iphone.setBatteryMah(batteryMah);
        iphone.setPrice(price);
    }
}

