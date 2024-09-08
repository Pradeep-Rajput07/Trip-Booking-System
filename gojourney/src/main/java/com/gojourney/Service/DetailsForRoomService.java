package com.gojourney.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gojourney.Entity.DetailsForRoomEntity;
import com.gojourney.Repository.DetailsForRoomRepository;

@Service
public class DetailsForRoomService {
@Autowired
DetailsForRoomRepository detailsForRoomRepository;

    public String detailsSaveForRoom(DetailsForRoomEntity detailsForRoomEntity){
        if(detailsForRoomEntity!=null){
            detailsForRoomRepository.save(detailsForRoomEntity);
            return "save sucessfully";

        }
        else{
            return  "save failed";
        }
        
    }

}
