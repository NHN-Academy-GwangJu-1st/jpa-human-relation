package com.nhnacademy.controller.restapi;

import com.nhnacademy.domain.FamilyRelationshipDTO;
import com.nhnacademy.service.FamilyRelationshipService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/residents/{serialNumber}")
public class FamilyRelationshipController {

    private final FamilyRelationshipService familyRelationshipService;

    @PostMapping("/relationship")
    public com.nhnacademy.entity.FamilyRelationship registerFamilyRelationship(@PathVariable(name = "serialNumber") Long serialNumber,
                                                                               @RequestBody FamilyRelationshipDTO familyRelationshipRequest) {

        return familyRelationshipService.registerFamilyRelationship(serialNumber, familyRelationshipRequest);

    }

    @PutMapping("/relationship/{familySerialNumber}")
    public com.nhnacademy.entity.FamilyRelationship modifyFamilyRelationship(@PathVariable(name = "serialNumber") Long serialNumber,
                                                                             @PathVariable(name = "familySerialNumber") Long familySerialNumber,
                                                                             @RequestBody FamilyRelationshipDTO familyRelationshipRequest) {

        return familyRelationshipService.modifyFamilyRelationship(serialNumber, familySerialNumber, familyRelationshipRequest);
    }

    @DeleteMapping("/relationship/{familySerialNumber}")
    public void deleteFamilyRelationship(@PathVariable(name = "serialNumber") Long serialNumber,
                                         @PathVariable(name = "familySerialNumber") Long familySerialNumber) {
        familyRelationshipService.deleteFamilyRelationship(serialNumber, familySerialNumber);
    }
}
