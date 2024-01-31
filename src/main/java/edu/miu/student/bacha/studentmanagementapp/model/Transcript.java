package edu.miu.student.bacha.studentmanagementapp.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Transcript {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long primaryKey;
    private String transcriptId;
    private String degreeTitle;
//Make the relationship between Student entity and Transcript entity a one-to-one.
    @OneToOne(mappedBy = "transcript", cascade = CascadeType.ALL)
    private Student student;

// And then implement JPA code for mapping and persisting/saving a student-and-transcript
// object data. Sample data: Transcript {1, "BS Computer Science"}
}
