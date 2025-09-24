package com.nicholasashenfelter.ActalentProject.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class IgnitionStatus {
    private boolean running;
    private String status;
    private String datetime;
}
