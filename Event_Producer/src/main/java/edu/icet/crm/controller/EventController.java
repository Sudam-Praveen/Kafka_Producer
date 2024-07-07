package edu.icet.crm.controller;

import edu.icet.crm.service.EventService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequiredArgsConstructor
@RestController
public class EventController {

    private final EventService eventService;
    @PostMapping("/event/{eventId}")
    public void placeEvent(@PathVariable String eventId ){
        eventService.placeEvent(eventId);
    }
}
