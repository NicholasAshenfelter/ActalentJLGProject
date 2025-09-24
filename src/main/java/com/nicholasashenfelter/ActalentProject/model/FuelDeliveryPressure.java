package com.nicholasashenfelter.ActalentProject.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class FuelDeliveryPressure {
    private String datetime;
    private String pressure;
    private String unitOfMeasure;
}
