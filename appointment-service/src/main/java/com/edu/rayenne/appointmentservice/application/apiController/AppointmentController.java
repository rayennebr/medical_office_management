package com.edu.rayenne.appointmentservice.application.apiController;

import com.edu.rayenne.appointmentservice.application.apiResponse.ApiResponse;
import com.edu.rayenne.appointmentservice.domain.apiPort.AppointmentService;
import com.edu.rayenne.appointmentservice.domain.model.AppointmentModel;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/appointment")
@CrossOrigin("*")
@Slf4j
@RequiredArgsConstructor
public class AppointmentController {

    private final AppointmentService service;

    @PostMapping("/")
    ApiResponse<AppointmentModel> saveAppointment(@RequestBody AppointmentModel appointmentModel) {
        try {
            service.addAppointment(appointmentModel);
            return ApiResponse.<AppointmentModel>builder()
                    .status(200)
                    .message("added successfully")
                    .data(appointmentModel)
                    .build();
        } catch (Exception e) {
            log.error("error {}", e.getCause());
            return ApiResponse.<AppointmentModel>builder()
                    .status(400)
                    .message("error")
                    .data(null)
                    .build();
        }
    }

    @GetMapping("/")
    ApiResponse<List<AppointmentModel>> getAllAppointment() {
        try {
            return ApiResponse.<List<AppointmentModel>>builder()
                    .status(200)
                    .message("retrieve data successfully")
                    .data(service.getAllAppointment())
                    .build();
        } catch (Exception e) {
            return ApiResponse.<List<AppointmentModel>>builder()
                    .status(200)
                    .message("error")
                    .data(null)
                    .build();
        }
    }

    @DeleteMapping("/{id}")
    ApiResponse<List<AppointmentModel>> deleteAppointment(String id) {
        try {
            return ApiResponse.<List<AppointmentModel>>builder()
                    .status(200)
                    .message("delete data successfully")
                    .data(service.deleteAppointment(id))
                    .build();
        } catch (Exception e) {
            return ApiResponse.<List<AppointmentModel>>builder()
                    .status(200)
                    .message("error")
                    .data(null)
                    .build();

        }
    }
}