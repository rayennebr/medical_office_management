package com.edu.rayenne.appointmentservice.domain.persistentPort;


import com.edu.rayenne.appointmentservice.domain.model.AppointmentModel;

import java.util.List;

public interface AppointmentPersistent {

    AppointmentModel addAppointment(AppointmentModel AppointmentModel);
    List<AppointmentModel> getAllAppointment();
    List<AppointmentModel> deleteAppointment(String id);
    AppointmentModel updateAppointment(String id,AppointmentModel AppointmentModel);

}
