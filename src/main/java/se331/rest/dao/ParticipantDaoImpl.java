package se331.rest.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;
import se331.rest.entity.Organizer;
import se331.rest.entity.Participant;
import se331.rest.repository.OrganizerRepository;
import se331.rest.repository.ParticipantRepostitory;

import java.util.Optional;

@Repository
public class ParticipantDaoImpl implements ParticipantDao{
    @Autowired
    ParticipantRepostitory participantRepository;
    @Override
    public Page<Participant> getParticipant(Pageable pageRequest){
        return participantRepository.findAll(pageRequest);
    }

    @Override
    public Optional<Participant> findById(Long id){
        return participantRepository.findById(id);
    }
}
