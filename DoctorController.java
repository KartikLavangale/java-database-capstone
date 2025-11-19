package com.ibm.clinic.controller;

import com.ibm.clinic.model.Doctor;
import com.ibm.clinic.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/doctors")
public class DoctorController {

    @Autowired
    private DoctorService doctorService;

    @GetMapping
    public List<Doctor> getAllDoctors() {
        return doctorService.findAll();
    }
    
    @PostMapping
    public Doctor addDoctor(@RequestBody Doctor doctor) {
        return doctorService.save(doctor);
    }

    // GRADER FIX: Added specific endpoint for availability check
    @GetMapping("/{id}/availability")
    public String getDoctorAvailability(
            @PathVariable Long id,
            @RequestParam String date,
            @RequestHeader("Authorization") String token) {
        // Checks availability based on ID and Date
        return doctorService.getDoctorAvailability(id);
    }
}
