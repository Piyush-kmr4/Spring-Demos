package securtiyspring.databse.jpaandspringsecurity;

import models.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<Users,Integer> {
    Users findByUserName(String userName);


}
