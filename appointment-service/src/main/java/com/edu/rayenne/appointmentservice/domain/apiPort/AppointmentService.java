package com.edu.rayenne.appointmentservice.domain.apiPort;

import com.edu.rayenne.appointmentservice.domain.model.AppointmentModel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AppointmentService {

    AppointmentModel addAppointment(AppointmentModel AppointmentModel);
    List<AppointmentModel> getAllAppointment();
    List<AppointmentModel> deleteAppointment(String id);
    AppointmentModel updateAppointment(String id,AppointmentModel AppointmentModel);
}
