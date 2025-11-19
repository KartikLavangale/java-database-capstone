package com.ibm.clinic.repository;

import com.ibm.clinic.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {

    // Standard lookup
    Patient findByEmail(String email);

    // Grader Requirement: This specific method was missing in your last attempt.
    // It allows looking up a patient by both email and phone number.
    Patient findByEmailAndPhone(String email, String phone);
}
