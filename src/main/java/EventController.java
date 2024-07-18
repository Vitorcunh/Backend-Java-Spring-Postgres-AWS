

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eventostec.api.domain.event.Event;
import com.eventostec.api.domain.event.EventRequestDTO;
import com.eventostec.api.service.EventService;

@RestController
@RequestMapping("/api/event")

public class EventController {

  @Autowired
  private EventService eventService;

  @PostMapping
  public ResponseEntity<Event> create (@RequestBody EventRequestDTO body){
    Event newEvent = this.eventService.createEvent(body);
    return ResponseEntity.ok(newEvent);
  }
}

public class EventController {

  @Autowired
  private EventService eventService;

  @PostMapping
  public ResponseEntity<Event> create(@RequestParam("tile") String title,
                                      @RequestParam(value = "description", required = false) String description,
                                      @RequestParam("date") Long date,
                                      @RequestParam("city") String state,
                                      @RequestParam("state") String date,
                                      @RequestParam("remote") Boolean remote, 
                                      @RequestParam("eventUrl") String eventUrl,
                                      @RequestParam(value = "image", required = false) MultipartFile image) {
  EventRequestDTO eventRequestDTO = new EventRequestDTO(title, description, date, city, state, remote, eventUrl, image);
  return ResponseEntity.ok(newEvent);
    }
  
  }
   
