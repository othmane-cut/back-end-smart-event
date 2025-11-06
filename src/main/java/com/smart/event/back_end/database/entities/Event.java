package com.smart.event.back_end.database.entities;

import com.smart.event.back_end.database.entities.enums.EventStatus;
import com.smart.event.back_end.database.entities.enums.EventType;
import com.smart.event.back_end.database.entities.enums.EventVisibility;
import com.smart.event.back_end.database.entities.interfaces.SocialNetwork;

import java.util.List;

public class Event {
    private String id ;
    private String title ;
    private String description ;
    private String image ;
    private String startDate ;
    private String endDate ;
    private EventVisibility visibility ;
    private EventType type ;
    private List<String> sponsors ;
    private EventStatus status ;
    private Category category ;
    private User createdBy ;
    private Badge badge ;
    private List<Member> organizers ;
    private SocialNetwork socialNetwork ;
}
