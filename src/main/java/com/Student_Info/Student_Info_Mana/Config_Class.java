/*
package com.Student_Info.Student_Info_Mana;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import java.time.*;
import java.util.List;


public class Config_Class {
    @Bean
    CommandLineRunner commandLineRunner(Repo_Class repo_class){
      return args ->{
          StudentClass abiola=new StudentClass(1,
                  "Ayodele",
                  "ayodeleabiola1994@gmail.com",
                  LocalDate.of(2000, Month.JULY,8),
                  20
          );
          StudentClass kunle=new StudentClass(1,
                  "Owolabi",
                  "ayodeleabiola94@gmail.com",
                  LocalDate.of(2002, Month.JULY,20),
                  20
          );
          repo_class.saveAll(List.of(abiola,kunle));
      };

    }
}*/


