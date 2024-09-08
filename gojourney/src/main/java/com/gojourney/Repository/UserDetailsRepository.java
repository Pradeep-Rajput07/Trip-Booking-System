package com.gojourney.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gojourney.Entity.UserDetailsEntity;
@Repository

public interface UserDetailsRepository extends JpaRepository<UserDetailsEntity, Integer> {
    



}
