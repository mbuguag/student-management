package com.example.patient_service.patient;

import com.example.patient_service.dto.PatientResponseDTO;
import com.example.patient_service.mapper.PatientMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {

    private PatientRepository patientRepository;

    public PatientService(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    public List<PatientResponseDTO> getPatients(){
        List<Patient> patients = patientRepository.findAll();

        return patients.stream()
                .map( PatientMapper::toDTO)
                .toList();
    }
}

