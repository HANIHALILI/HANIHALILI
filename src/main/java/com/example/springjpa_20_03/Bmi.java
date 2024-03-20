package com.example.springjpa_20_03;

import jakarta.persistence.Embeddable;

@Embeddable
public class Bmi {
    private float height;
    private float weight;

    public Bmi() {
    }

    public Bmi(float height, float weight) {
        this.height = height;
        this.weight = weight;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }
}
