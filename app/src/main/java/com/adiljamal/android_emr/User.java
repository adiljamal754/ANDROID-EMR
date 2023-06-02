package com.adiljamal.android_emr;

import com.google.gson.annotations.SerializedName;

public class User {
    @SerializedName("id")
    private int id;

    @SerializedName("name")
    private String name;

    @SerializedName("gender")
    private String gender;

    @SerializedName("bi")
    private String bi;

    @SerializedName("nationality")
    private String nationality;

    @SerializedName("maritalState")
    private String maritalState;

    @SerializedName("profession")
    private String profession;

    @SerializedName("bloodGroup")
    private String bloodGroup;

    @SerializedName("email")
    private String email;

    @SerializedName("password")
    private String password;

    @SerializedName("address")
    private String address;

    @SerializedName("phoneNumber")
    private String phoneNumber;

    @SerializedName("emergencyPhoneNumber")
    private String emergencyPhoneNumber;

    @SerializedName("emergencyName")
    private String emergencyName;

    @SerializedName("emergencyRelationship")
    private String emergencyRelationship;

    @SerializedName("insuranceName")
    private String insuranceName;

    @SerializedName("insurancePolicy")
    private String insurancePolicy;

    @SerializedName("insuranceContact")
    private String insuranceContact;

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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBi() {
        return bi;
    }

    public void setBi(String bi) {
        this.bi = bi;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getMaritalState() {
        return maritalState;
    }

    public void setMaritalState(String maritalState) {
        this.maritalState = maritalState;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmergencyPhoneNumber() {
        return emergencyPhoneNumber;
    }

    public void setEmergencyPhoneNumber(String emergencyPhoneNumber) {
        this.emergencyPhoneNumber = emergencyPhoneNumber;
    }

    public String getEmergencyName() {
        return emergencyName;
    }

    public void setEmergencyName(String emergencyName) {
        this.emergencyName = emergencyName;
    }

    public String getEmergencyRelationship() {
        return emergencyRelationship;
    }

    public void setEmergencyRelationship(String emergencyRelationship) {
        this.emergencyRelationship = emergencyRelationship;
    }

    public String getInsuranceName() {
        return insuranceName;
    }

    public void setInsuranceName(String insuranceName) {
        this.insuranceName = insuranceName;
    }

    public String getInsurancePolicy() {
        return insurancePolicy;
    }

    public void setInsurancePolicy(String insurancePolicy) {
        this.insurancePolicy = insurancePolicy;
    }

    public String getInsuranceContact() {
        return insuranceContact;
    }

    public void setInsuranceContact(String insuranceContact) {
        this.insuranceContact = insuranceContact;
    }
}
