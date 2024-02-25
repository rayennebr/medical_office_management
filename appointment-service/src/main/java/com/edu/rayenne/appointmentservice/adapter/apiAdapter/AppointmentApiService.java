package com.edu.rayenne.appointmentservice.adapter.apiAdapter;

import com.edu.rayenne.appointmentservice.domain.apiPort.AppointmentService;
import com.edu.rayenne.appointmentservice.domain.model.AppointmentModel;
import com.edu.rayenne.appointmentservice.domain.persistentPort.AppointmentPersistent;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
@RequiredArgsConstructor
@Slf4j
public class AppointmentApiService implements AppointmentService {

    private final AppointmentPersistent appointmentPersistent;

    @Override
    public AppointmentModel addAppointment(AppointmentModel AppointmentModel) {
        return appointmentPersistent.addAppointment(AppointmentModel);
    }

    @Override
    public List<AppointmentModel> getAllAppointment() {
        return appointmentPersistent.getAllAppointment();
    }

    @Override
    public List<AppointmentModel> deleteAppointment(String id) {
        return appointmentPersistent.deleteAppointment(id);
    }

    @Override
    public AppointmentModel updateAppointment(String id, AppointmentModel AppointmentModel) {
        return null;
    }
}
