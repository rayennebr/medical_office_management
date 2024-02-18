package com.edu.rayenne.appointmentservice.domain.apiPort;

import com.edu.rayenne.appointmentservice.domain.model.AppointmentModel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AppointmentService {

    AppointmentModel addAppointment(AppointmentModel AppointmentModel);
    List<AppointmentModel> getAllAppointment();
    List<AppointmentModel> deleteAppointment(Long id);
    AppointmentModel updateAppointment(Long id,AppointmentModel AppointmentModel);
}
