package com.gojourney.Repository;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gojourney.Entity.UserEntity2;


@Repository

public interface UserRepository extends JpaRepository<UserEntity2, Integer> {
    Optional<UserEntity2> findByEmail(String email);

}
