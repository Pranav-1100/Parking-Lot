package com.pranav.parkinglotproject.dtos;

import com.pranav.parkinglotproject.Models.VehicleType;

public class IssueTicketRequestDto {
    private Long GateId;
    private VehicleType VehicleType;
    private String VehicleNumber;
    private String OwnerName;

    public Long getGateId() {
        return GateId;
    }


    public void setGateId(Long gateId) {
        this.GateId = gateId;
    }

    public VehicleType getVehicleType() {
        return VehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.VehicleType = vehicleType;
    }

    public String getVehicleNumber() {
        return VehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.VehicleNumber = vehicleNumber;
    }

    public String getOwnerName() {
        return OwnerName;
    }

    public void setOwnerName(String ownerName) {
        this.OwnerName = ownerName;
    }
}
