package com.Student_Info.Student_Info_Mana;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;


import java.time.Month;
import java.time.LocalDate;
import java.util.List;

@SpringBootApplication


public class StudentInfoManaApplication implements CommandLineRunner {
    @Autowired
    Repo_Class repo_class;
	public static void main(String[] args) {
		SpringApplication.run(StudentInfoManaApplication.class, args);

	}
    @Override
    public void run(String...args){
        StudentClass abiola=new StudentClass(1,
                "Ayodele",
                "ayodeleabiola1994@gmail.com",
                LocalDate.of(2000, Month.JULY,8),
                20);
        StudentClass kunle=new StudentClass(2,
                "Owolabi",
                "ayodeleabiola94@gmail.com",
                LocalDate.of(2002, Month.JULY,20),
                20
        );
        repo_class.saveAll(List.of(abiola,kunle));
    }

}
