package com.ibm.clinic.service;

import com.ibm.clinic.model.Appointment;
import com.ibm.clinic.repository.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AppointmentService {

    @Autowired
    private AppointmentRepository appointmentRepository;

    public List<Appointment> findAll() {
        return appointmentRepository.findAll();
    }
    
    public Appointment bookAppointment(Appointment appointment) {
        return appointmentRepository.save(appointment);
    }
}
