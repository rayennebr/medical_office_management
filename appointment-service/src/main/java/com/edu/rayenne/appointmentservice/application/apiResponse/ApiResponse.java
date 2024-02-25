package com.edu.rayenne.appointmentservice.application.apiResponse;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public record ApiResponse<T>(
        int status,
        T data,
        String message
) {
}
