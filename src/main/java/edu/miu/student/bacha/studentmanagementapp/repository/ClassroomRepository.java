package edu.miu.student.bacha.studentmanagementapp.repository;

import edu.miu.student.bacha.studentmanagementapp.model.Classroom;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClassroomRepository extends JpaRepository<Classroom,Long> {
}
