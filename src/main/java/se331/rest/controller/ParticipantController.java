package se331.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import se331.rest.service.OrganizerService;
import se331.rest.service.ParticipantService;
import se331.rest.util.LabMapper;

@RestController
public class ParticipantController {
    @Autowired
    ParticipantService participantService;
    @GetMapping("/participants")
    ResponseEntity<?> getParticipant(){
        return ResponseEntity.ok(LabMapper.INSTANCE.getParticipantDTO(participantService.getAllParticipant()));
    }
}
