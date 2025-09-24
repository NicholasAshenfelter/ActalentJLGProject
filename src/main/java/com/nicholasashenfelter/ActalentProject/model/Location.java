package com.nicholasashenfelter.ActalentProject.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Location {
    private String datetime;
    private double latitude;
    private double longitude;
    private String gpsAccuracy;
    private String gsmStrength;
}
