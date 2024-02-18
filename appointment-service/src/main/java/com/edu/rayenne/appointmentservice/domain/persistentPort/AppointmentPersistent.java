package com.edu.rayenne.appointmentservice.domain.persistentPort;


import com.edu.rayenne.appointmentservice.domain.model.AppointmentModel;

import java.util.List;

public interface AppointmentPersistent {

    AppointmentModel addAppointment(AppointmentModel AppointmentModel);
    List<AppointmentModel> getAllAppointment();
    List<AppointmentModel> deleteAppointment(Long id);
    AppointmentModel updateAppointment(Long id,AppointmentModel AppointmentModel);

}
