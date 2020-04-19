package com.hibernate.orminboot;

import com.hibernate.orminboot.model.Alien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface AlienRepo extends JpaRepository<Alien,Integer> {
   // List<Alien> findByAname(String aname); //Query DSL

    //Query Annotation
    @Query("from Alien where aname= :name")
    List<Alien> find(@Param("name") String aname);
}
