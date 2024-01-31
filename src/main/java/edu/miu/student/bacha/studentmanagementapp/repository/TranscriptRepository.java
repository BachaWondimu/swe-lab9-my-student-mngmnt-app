package edu.miu.student.bacha.studentmanagementapp.repository;

import edu.miu.student.bacha.studentmanagementapp.model.Transcript;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TranscriptRepository extends JpaRepository<Transcript,Long> {
}
