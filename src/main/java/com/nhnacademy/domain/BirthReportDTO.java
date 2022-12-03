package com.nhnacademy.domain;

import lombok.Getter;

import java.time.LocalDateTime;
import java.util.Date;

@Getter
public class BirthReportDTO {
    private Long residentSerialNumber;
    private String birthDeathTypeCode;
    private Long reportResidentSerialNumber;
    private LocalDateTime birthDeathReportDate;
    private String birthReportQualificationsCode;
    private String emailAddress;
    private String phoneNumber;
}
