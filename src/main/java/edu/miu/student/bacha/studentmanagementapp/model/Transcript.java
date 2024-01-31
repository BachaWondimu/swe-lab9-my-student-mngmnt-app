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
    @OneToOne(mappedBy = "transcript", cascade = CascadeType.ALL)
    private Student student;
}


