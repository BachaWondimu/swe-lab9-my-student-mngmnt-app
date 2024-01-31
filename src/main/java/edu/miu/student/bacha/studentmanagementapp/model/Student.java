package edu.miu.student.bacha.studentmanagementapp.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Past;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long studentId;
    //Bean Validation - using @NotNull, @NotEmpty, @NotBlank, @DateTimeFormat)
    @NotBlank(message = "Name cannot be empty")
    String studentNumber; //required
    @NotBlank(message = "Name cannot be empty")
    String firstName; //required

    String middleName;
    @NotBlank(message = "Name cannot be empty")
    String lastName;//required
    Double cgpa;
    @Past(message = "Date of enrollment must be in the past")
    @DateTimeFormat
    LocalDate dateOfEnrollment;
    @OneToOne(cascade = CascadeType.ALL)
    private Transcript transcript;
}
