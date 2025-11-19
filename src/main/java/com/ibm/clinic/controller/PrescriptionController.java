package com.ibm.clinic.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/prescriptions")
public class PrescriptionController {

    @GetMapping("/{patientId}")
    public ResponseEntity<List<String>> getPrescriptions(@PathVariable Long patientId) {
        // Returns a dummy list of prescriptions
        return ResponseEntity.ok(List.of("Prescription 1: Vitamin C", "Prescription 2: Amoxicillin"));
    }
    
    @PostMapping
    public ResponseEntity<String> addPrescription(@RequestBody String prescription) {
        // Logic to add prescription would go here
        return ResponseEntity.ok("Prescription added successfully: " + prescription);
    }
}
