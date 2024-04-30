package com.pranav.parkinglotproject.repositories;

import com.pranav.parkinglotproject.Models.Gate;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class GateRepository {
    private Map<Long, Gate> Gates = new HashMap<>();

    public Optional<Gate> findById(Long gateId) {
        if (Gates.containsKey(gateId)) {
            return Optional.of(Gates.get(gateId));
        }
        return Optional.empty();
    }
}
