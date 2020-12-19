package com.uditagarwal.builder_pattern.builder;

import com.uditagarwal.builder_pattern.car_components.*;
import lombok.Builder;

import java.util.List;

@Builder
public class CarWithLombokBuilder {

    // Required properties
    private Engine engine;
    private Fuel fuel;
    private List<Seat> seats;
    private Steering steering;

    // Optional properties
    private AirBags airBags;
    private CentralLock centralLock;
    private MusicSystem musicSystem;
    private SunRoof sunRoof;
}
