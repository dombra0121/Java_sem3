package ru.mirea.laba_3;

public abstract class Furniture {
    protected boolean availability;
    protected int quantity;

    public Furniture(){}
    public Furniture(boolean availability, int quantity){
        this.quantity = quantity;
        this.availability = availability;
    }

    public int getQuantity() {
        return quantity;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public abstract String Size();
    public abstract String toString();
}
