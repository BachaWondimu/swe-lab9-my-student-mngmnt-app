package edu.miu.student.bacha.studentmanagementapp.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Classroom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long primaryKey;
    private String buildingName;
    private String roomNumber;
    @OneToMany(mappedBy = "classroom", cascade = CascadeType.ALL)
    private List<Student> students;
}
