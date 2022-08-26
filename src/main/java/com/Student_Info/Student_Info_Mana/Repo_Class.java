package com.Student_Info.Student_Info_Mana;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Repo_Class extends JpaRepository<StudentClass,Long> {

}
