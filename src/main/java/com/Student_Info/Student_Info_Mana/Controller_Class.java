
package com.Student_Info.Student_Info_Mana;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RequestMapping(path="api/v1/StudentClass")
@RestController
@AllArgsConstructor
@Slf4j

public class Controller_Class {
    private final Service_Class studentService;

    @GetMapping("/student")
    public List<StudentClass>getStudents(){
        return studentService.getStudents();

    }

    @GetMapping(path = "/student/{Id}")
    public Optional<StudentClass> getStudentId(@PathVariable("id") Long id ){

    return studentService.getStudentById(id);
    }
    @PostMapping("studentClass")
    public StudentClass postStudent(@RequestBody StudentClass studentClass){
        return studentService.postStudent(studentClass);
    }
    @DeleteMapping("studentId")
    public String deleteStudentById(@PathVariable("studentId") Long studentId) {
        studentService.deleteStudentById(studentId);
        return "Student Successfuly deleted";
    }
    @PutMapping
    public String updateStudent(@RequestBody StudentClass studentClass ){
         studentService.updateStudent(studentClass);
         return "Student Record updated Successsfuly";

    }

}
