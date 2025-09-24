package com.nicholasashenfelter.ActalentProject.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Engine {
    private EngineLoad engineLoad;
    private FuelDeliveryPressure fuelDeliveryPressure;
    private OilPressure oilPressure;
    private IntakeManifold1Pressure intakeManifold1Pressure;
    private IntakeManifold1Temperature intakeManifold1Temperature;
    private BarometricPressure barometricPressure;
    private CoolantTemp coolantTemp;
    private FuelConsumptionRate fuelConsumptionRate;
    private EngineSpeed engineSpeed;
    private FuelUsed fuelUsed;
    private RequestedTorque requestedTorque;
    private ActualTorque actualTorque;
    private RequestedSpeedLimit requestedSpeedLimit;
}
