package edu.miu.student.bacha.studentmanagementapp;

import edu.miu.student.bacha.studentmanagementapp.model.Student;
import edu.miu.student.bacha.studentmanagementapp.repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;

@SpringBootApplication
public class StudentManagementAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudentManagementAppApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        return args -> {
            System.out.println("hello from clr");
            Student student = new Student(1L, "000-61-0001", "Anna", "Lynn", "Smith", 3.45, LocalDate.of(2019, 5, 24));
            saveStudent(student, studentRepository);
        };
    }

    private void saveStudent(Student student, StudentRepository studentRepository) {
        studentRepository.save(student);
        System.out.println("Student saved successfully: " + student);
    }

}
