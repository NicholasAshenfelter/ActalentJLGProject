package com.nicholasashenfelter.ActalentProject.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EquipmentHeader {
    private String equipmentID;
    private String oemName;
    private String model;
    private String serialNumber;
    private String terminalID;
    private String modelType;
    private String companyName;
    private String messageType;
    private String customerNumber;
    private String year;
    private String engineOrBatteryTier;
    private String unitInstallDateTime;
}
