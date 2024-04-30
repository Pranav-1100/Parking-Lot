package com.pranav.parkinglotproject.services;

import com.pranav.parkinglotproject.exceptions.InvalidGateException;
import com.pranav.parkinglotproject.Models.Gate;
import com.pranav.parkinglotproject.Models.Ticket;
import com.pranav.parkinglotproject.Models.VehicleType;
import com.pranav.parkinglotproject.repositories.GateRepository;

import java.util.Date;
import java.util.Optional;

public class TicketService {
    private GateRepository gateRepository;

    public TicketService(GateRepository gateRepository) {
        this.gateRepository = gateRepository;
    }

    public Ticket issueTicket(Long gateId, String vehicleNumber, VehicleType vehicleType, String ownerName) throws InvalidGateException {
        Ticket ticket = new Ticket();
        ticket.setEntryTime(new Date());

        Optional<Gate> optionalGate = gateRepository.findById(gateId);

        if (optionalGate.isEmpty()) {
            throw new InvalidGateException("Invalid gate Id");
        }

        Gate gate = optionalGate.get();
        ticket.setGeneratedAt(gate);
        ticket.setGeneratedBy(gate.getOperator());




        return null;
    }
}
