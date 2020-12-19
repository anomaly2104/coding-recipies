package com.uditagarwal.builder_pattern.setters;

import com.uditagarwal.builder_pattern.car_components.*;

import java.util.List;

public class CarWithSetters {

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

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setFuel(Fuel fuel) {
        this.fuel = fuel;
    }

    public void setSeats(List<Seat> seats) {
        this.seats = seats;
    }

    public void setSteering(Steering steering) {
        this.steering = steering;
    }

    public void setAirBags(AirBags airBags) {
        this.airBags = airBags;
    }

    public void setCentralLock(CentralLock centralLock) {
        this.centralLock = centralLock;
    }

    public void setMusicSystem(MusicSystem musicSystem) {
        this.musicSystem = musicSystem;
    }

    public void setSunRoof(SunRoof sunRoof) {
        this.sunRoof = sunRoof;
    }
}
