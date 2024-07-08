package com.eventostec.api.service;

import java.sql.Date;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import com.eventostec.api.domain.event.Event;
import com.eventostec.api.domain.event.EventRequestDTO;

@Service
public class EventService {

  public Event createEvent(EventRequestDTO data){
      String imgUrl = null;

      if(data.image() != null) {
       imgUrl = this.uploadImg(data.image());
      }

      Event  newEvent = new Event();
      newEvent.setTitle(data.title());
      newEvent.setDescription(data.description());
      newEvent.setEventUrl(data.eventURL());
      newEvent.setDate(new Date(data.date()));
      newEvent.setImgUrl(imgUrl);

      return newEvent;
  }

  private String uploadImg(MultipartFile multipartFile){
    return  "";
  }
}
