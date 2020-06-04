package com.company;

public class Movie extends Item {
    private String duration;

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        super.toString();
        Item.class.toString();
        return "Movie{" +
                "duration='" + duration + '\'' +    super.toString() +
                '}';
    }
}
