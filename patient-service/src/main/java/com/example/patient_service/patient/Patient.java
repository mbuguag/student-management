package com.example.patient_service.patient;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.UUID;

@Entity
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(
            name = "name",
            nullable = false
    )
    private String name;

    @Column(
            name = "email",
            unique = true
    )
    private String email;

    @Column(
            name = "address"
    )
    private String address;

    @Column(
            name = "dob"
    )
    private LocalDate dateOfBirth;
    private LocalDate registeredDate;

    public Patient() {
    }

    public Patient(UUID id,
                   String name,
                   String email,
                   String address,
                   LocalDate registeredDate,
                   LocalDate dateOfBirth) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.address = address;
        this.registeredDate = registeredDate;
        this.dateOfBirth = dateOfBirth;
    }

    public Patient(String name,
                   String email,
                   String address,
                   LocalDate dateOfBirth,
                   LocalDate registeredDate) {
        this.name = name;
        this.email = email;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
        this.registeredDate = registeredDate;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public LocalDate getRegisteredDate() {
        return registeredDate;
    }

    public void setRegisteredDate(LocalDate registeredDate) {
        this.registeredDate = registeredDate;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", registeredDate=" + registeredDate +
                '}';
    }
}
