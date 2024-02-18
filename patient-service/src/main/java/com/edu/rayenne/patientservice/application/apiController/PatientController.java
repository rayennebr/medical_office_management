package com.edu.rayenne.patientservice.application.apiController;

import com.edu.rayenne.patientservice.application.response.ResponseApi;
import com.edu.rayenne.patientservice.domain.apiPort.PatientService;
import com.edu.rayenne.patientservice.domain.model.PatientModel;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/patient")
@CrossOrigin("*")
@Slf4j
@RequiredArgsConstructor
public class PatientController {
    private final PatientService patientService;

    @GetMapping("/")
    public ResponseApi<List<PatientModel>> retrieveAllPatient()
    {
        try{
            return ResponseApi
                    .<List<PatientModel>>builder()
                    .status(200)
                    .msg("success")
                    .data(patientService.getAllPatient())
                    .build();
        }catch (Exception e)
        {
            log.error("error in retrieveAllPatient function ",e.getCause());
            return ResponseApi
                .<List<PatientModel>>builder()
                .status(400)
                .msg(e.getMessage())
                .data(null)
                .build();
        }
    }

    @PostMapping("/")
    public ResponseApi<PatientModel> addPatient(@RequestBody PatientModel patient)
    {
        try{
            return ResponseApi
                    .<PatientModel>builder()
                    .status(200)
                    .msg("success")
                    .data(patientService.addPatient(patient))
                    .build();
        }catch (Exception e)
        {
            log.error("error in addPatient function ",e.getCause());
            return ResponseApi
                    .<PatientModel>builder()
                    .status(400)
                    .msg(e.getMessage())
                    .data(null)
                    .build();
        }
    }

    @PutMapping("/{id}")
    public ResponseApi<PatientModel> updatePatient(
            @PathVariable Long id,
            @RequestBody PatientModel patientModel)
    {
        try{
            return ResponseApi
                    .<PatientModel>builder()
                    .status(200)
                    .msg("success")
                    .data(patientService.updatePatient(id,patientModel))
                    .build();
        }catch (Exception e)
        {
            log.error("error in update function ",e.getCause());
            return ResponseApi
                    .<PatientModel>builder()
                    .status(400)
                    .msg(e.getMessage())
                    .data(null)
                    .build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseApi<List<PatientModel>> deletePatient(@PathVariable Long id)
    {
        try{
            return ResponseApi
                    .<List<PatientModel>>builder()
                    .status(200)
                    .msg("success")
                    .data(patientService.deletePatient(id))
                    .build();
        }catch (Exception e)
        {
            log.error("error in delete function ",e.getCause());
            return ResponseApi
                    .<List<PatientModel>>builder()
                    .status(400)
                    .msg(e.getMessage())
                    .data(null)
                    .build();
        }
    }
}
