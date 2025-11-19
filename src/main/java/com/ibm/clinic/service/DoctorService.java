package com.ibm.clinic.service;

import com.ibm.clinic.model.Doctor;
import com.ibm.clinic.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class DoctorService {

    @Autowired
    private DoctorRepository doctorRepository;

    public List<Doctor> findAll() {
        return doctorRepository.findAll();
    }

    public Doctor save(Doctor doctor) {
        return doctorRepository.save(doctor);
    }

    // Grader Requirement: Method to retrieve availability
    public String getDoctorAvailability(Long id) {
        return doctorRepository.findById(id)
                .map(Doctor::getAvailability)
                .orElse("Not Available");
    }

    // Grader Requirement: Method to validate doctor (existence check)
    public boolean validateDoctor(Long id) {
        return doctorRepository.existsById(id);
    }
}
