package edu.miu.student.bacha.studentmanagementapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Past;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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
    //    @- Data Validation mechanisms
//            (e.g. setting Column Constraints,
//             Bean Validation - using @NotNull, @NotEmpty, @NotBlank, @DateTimeFormat etc)
    @NotBlank(message = "Name cannot be empty")
    String studentNumber; //: (required) (e.g. Data values: 000-61-0001, 000-61-0002, etc.)
    @NotBlank(message = "Name cannot be empty")
    String firstName; //: (required) (e.g.  Data values: "Anna", "Bob" etc.)

    String middleName;// : (is optional) (e.g.  Data values: "Lynn", "" etc.)
    @NotBlank(message = "Name cannot be empty")
    String lastName;//: (required) (e.g.  Data values: "Smith", "Galverston" etc.)
    Double cgpa;// : (is optional) (e.g. Data values: 3.45, 2.87, etc)
    @Past(message = "Date of enrollment must be in the past")
    LocalDate dateOfEnrollment; // (This field contains date values; representing the date of enrollment of the student)
}
