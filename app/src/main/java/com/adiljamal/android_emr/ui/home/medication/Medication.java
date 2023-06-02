package com.adiljamal.android_emr.ui.home.medication;

public class Medication {

    private int id;
    private String name;
    private String dosage;
    private String instructions;

    public Medication(){

    }

    // Construtor
    public Medication(int id, String name, String dosage, String instructions) {
        this.id = id;
        this.name = name;
        this.dosage = dosage;
        this.instructions = instructions;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDosage() {
        return dosage;
    }

    public void setDosage(String dosage) {
        this.dosage = dosage;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }
}
