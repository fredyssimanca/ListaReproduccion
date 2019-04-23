package com.example.freddyssimanca.listareproduccion;

public class ListItem {
    private String Nombre;
    private String designation;
    private String location;



    public String getName() {
        return Nombre;
    }

    public void setNombre(String name) {
        this.Nombre = name;
    }
    public String getDesignation() {
        return designation;
    }
    public void setDesignation(String designation) {
        this.designation = designation;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
}
