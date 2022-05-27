package com.example.project;

public class Color {
    private String id;
    private String name;
    private String location;
    private int cost;
    private int size;
    private int company;
    private Auxdata auxdata;

    public Color(String id, String name, String location, int cost, int size, int company, Auxdata auxdata) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.cost = cost;
        this.size = size;
        this.company = company;
        this.auxdata = auxdata;
    }

    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getLocation() {
        return location;
    }
    public int getCost(){return cost;}
    public int getSize() {
        return size;
    }
    public int getCompany(){return company;}
    public Auxdata getAuxdata() {
        return auxdata;
    }


}