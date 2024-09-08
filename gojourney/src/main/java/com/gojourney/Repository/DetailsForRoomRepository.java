package com.gojourney.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gojourney.Entity.DetailsForRoomEntity;
@Repository
public interface DetailsForRoomRepository extends  JpaRepository<DetailsForRoomEntity ,Integer>{

}
