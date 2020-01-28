package com.bridgelabz;

public class Feet {
    double length;

    public Feet(double length) {
        this.length = length;
    }

    public Feet() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Feet feet = (Feet) o;
        return Double.compare(feet.length, length) == 0;
    }


}
