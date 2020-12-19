package com.uditagarwal.builder_pattern.constructors;

import com.uditagarwal.builder_pattern.car_components.*;
import lombok.NonNull;

import java.util.List;

public class CarWithConstructor {
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

    // Single Constructor
    public CarWithConstructor(@NonNull Engine engine, @NonNull Fuel fuel, @NonNull List<Seat> seats, @NonNull Steering steering,
                              AirBags airBags, CentralLock centralLock, MusicSystem musicSystem, SunRoof sunRoof) {
        this.engine = engine;
        this.fuel = fuel;
        this.seats = seats;
        this.steering = steering;
        this.airBags = airBags;
        this.centralLock = centralLock;
        this.musicSystem = musicSystem;
        this.sunRoof = sunRoof;
    }

    // Multiple Constructors for each combination

    public CarWithConstructor(@NonNull Engine engine, @NonNull Fuel fuel, @NonNull List<Seat> seats, @NonNull Steering steering,
                              AirBags airBags) {
        this.engine = engine;
        this.fuel = fuel;
        this.seats = seats;
        this.steering = steering;
        this.airBags = airBags;
    }

    public CarWithConstructor(@NonNull Engine engine, @NonNull Fuel fuel, @NonNull List<Seat> seats, @NonNull Steering steering,
                              AirBags airBags, CentralLock centralLock) {
        this.engine = engine;
        this.fuel = fuel;
        this.seats = seats;
        this.steering = steering;
        this.airBags = airBags;
        this.centralLock = centralLock;
    }
}
