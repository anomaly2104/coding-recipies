package com.uditagarwal.builder_pattern.builder;

import com.uditagarwal.builder_pattern.car_components.*;
import lombok.NonNull;

import java.util.List;

public class CarWithBuilder {

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

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
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

        public Builder withEngine(@NonNull final Engine engine) {
            this.engine = engine;
            return this;
        }

        public Builder withFuel(@NonNull final Fuel fuel) {
            this.fuel = fuel;
            return this;
        }

        public Builder withSeats(@NonNull final List<Seat> seats) {
            this.seats = seats;
            return this;
        }

        public Builder withSteering(@NonNull final Steering steering) {
            this.steering = steering;
            return this;
        }

        public Builder withAirBags(@NonNull final AirBags airBags) {
            this.airBags = airBags;
            return this;
        }

        public Builder withCentralLock(@NonNull final CentralLock centralLock) {
            this.centralLock = centralLock;
            return this;
        }

        public Builder withMusicSystem(@NonNull final MusicSystem musicSystem) {
            this.musicSystem = musicSystem;
            return this;
        }

        public Builder withSunRoof(@NonNull final SunRoof sunRoof) {
            this.sunRoof = sunRoof;
            return this;
        }

        public CarWithBuilder build() {
            if (this.engine == null || this.steering == null || this.seats == null || this.fuel == null) {
                throw new RuntimeException("All required properties are not present.");
            }
            CarWithBuilder car = new CarWithBuilder();
            car.engine = engine;
            car.fuel = fuel;
            car.seats = seats;
            car.steering = steering;
            car.airBags = airBags;
            car.centralLock = centralLock;
            car.musicSystem = musicSystem;
            car.sunRoof = sunRoof;
            return car;
        }
    }
}
