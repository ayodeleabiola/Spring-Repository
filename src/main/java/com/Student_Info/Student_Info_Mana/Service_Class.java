package com.Student_Info.Student_Info_Mana;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class Service_Class {
    private final Repo_Class studentRepo;
    public Optional<StudentClass> getStudentById(Long id){
        return studentRepo.findById(id);

    }
    public List<StudentClass> getStudents(){
        return studentRepo.findAll();

    }
    public StudentClass postStudent(StudentClass student){
       return studentRepo.save(student);
    }
    public String updateStudent(StudentClass studentClass){
        studentRepo.save(studentClass);
        return "Student Successfully updated";
    }
    public String deleteStudentById(Long id){
        studentRepo.deleteById(id);
        return "Student Successfully deleted";
    }

}
