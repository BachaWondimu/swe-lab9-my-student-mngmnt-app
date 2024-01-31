package edu.miu.student.bacha.studentmanagementapp;

import edu.miu.student.bacha.studentmanagementapp.model.Student;
import edu.miu.student.bacha.studentmanagementapp.model.Transcript;
import edu.miu.student.bacha.studentmanagementapp.repository.StudentRepository;
import edu.miu.student.bacha.studentmanagementapp.repository.TranscriptRepository;
import lombok.Builder;
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
    public CommandLineRunner commandLineRunner(StudentRepository studentRepository, TranscriptRepository transcriptRepository) {
        return args -> {
            Transcript transcript = new Transcript(null, "Trc pt1", "BS Computer Science", null);
            transcriptRepository.save(transcript);
            System.out.println(transcript + " has been successfully saved!");
            Student student = new Student(null, "miu100", "Anna", null, "Smith", 3.45, LocalDate.of(2019, 5, 24), transcript);
            studentRepository.save(student);
            System.out.println(student + " has been successfully saved!");
        };
    }


}
