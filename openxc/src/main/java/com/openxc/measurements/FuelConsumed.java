package com.openxc.measurements;

import com.openxc.units.Liter;
import com.openxc.util.Range;

/**
 * The FuelConsumed is the fuel consumed since the vehicle was started.
 */
public class FuelConsumed extends Measurement<Liter>
        implements VehicleMeasurement {
    private final static Range<Liter> RANGE =
        new Range<Liter>(new Liter(0), new Liter(4294967295.0));
    public final static String ID = "fuel_consumed_since_restart";

    public FuelConsumed() { }

    public FuelConsumed(Double value) {
        super(new Liter(value), RANGE);
    }

    public FuelConsumed(Liter value) {
        super(value, RANGE);
    }
}
