package com.example.project;

public class Color {

    private String id;
    private String name;
    private String waveLength;
    private int frequency;
    private Auxdata auxdata;

    public Color(String id, String name, String waveLength, int frequency, Auxdata auxdata) {
        this.id = id;
        this.name = name;
        this.waveLength = waveLength;
        this.frequency = frequency;
        this.auxdata = auxdata;
    }

    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getWaveLength() {
        return waveLength;
    }
    public int getFrequency() {
        return frequency;
    }
    public Auxdata getAuxdata() {
        return auxdata;
    }

}
