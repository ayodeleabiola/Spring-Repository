package com.Student_Info.Student_Info_Mana;
import java.time.LocalDate;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;
import javax.persistence.GeneratedValue;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)

public class StudentClass {
    @Id
    @GeneratedValue(
      strategy =GenerationType.AUTO)
    private Integer id;
    private String name;
    private String email;
    @JsonFormat(shape=JsonFormat.Shape.STRING,pattern = "dd-mm-yyyy")
    private LocalDate dob;
    private int age;

}
