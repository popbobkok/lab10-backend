package se331.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import se331.rest.entity.Participant;

import java.util.List;

public interface ParticipantRepostitory  extends JpaRepository<Participant,Long> {
List<Participant> findAll();
}
