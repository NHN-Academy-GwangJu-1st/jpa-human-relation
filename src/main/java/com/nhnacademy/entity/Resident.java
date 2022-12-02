package com.nhnacademy.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;


@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Entity
@Table(name = "resident")
public class Resident {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "resident_serial_number")
    private Long residentSerialNumber;

    @Setter
    @Column(name = "name")
    private String name;

    @Column(name = "resident_registration_number")
    private String residentRegistrationNumber;

    @Column(name = "gender_code")
    private String genderCode;

    @Column(name = "birth_date")
    private LocalDateTime birthDate;

    @Column(name = "birth_place_code")
    private String birthPlaceCode;

    @Setter
    @Column(name = "registration_base_address")
    private String registrationBaseAddress;

    @Column(name = "death_date")
    private LocalDateTime deathDate;

    @Column(name = "death_place_code")
    private String deathPlaceCode;

    @Column(name = "death_place_address")
    private String deathPlaceAddress;

    public void modifyResidentInfo(String name, String registrationBaseAddress, LocalDateTime deathDate, String deathPlaceCode, String deathPlaceAddress) {
        if (name != null) {
            this.name = name;
        }

        if (registrationBaseAddress != null) {
            this.registrationBaseAddress = registrationBaseAddress;
        }

        if (deathDate != null) {
            this.deathDate = deathDate;
        }

        if (deathPlaceCode != null) {
            this.deathPlaceCode = deathPlaceCode;
        }

        if (deathPlaceAddress != null) {
            this.deathPlaceAddress = deathPlaceAddress;
        }
    }

//    @OneToMany(mappedBy = "resident")
//    private List<FamilyRelationship> familyRelationships;
//
//    @OneToMany(mappedBy = "resident")
//    private List<HouseholdCompositionResident> householdCompositionResidents;
}
