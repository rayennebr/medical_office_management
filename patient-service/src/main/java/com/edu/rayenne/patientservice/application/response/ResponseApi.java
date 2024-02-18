package com.edu.rayenne.patientservice.application.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ResponseApi <T>{
    private int status;
    private String msg;
    private T data;
}
