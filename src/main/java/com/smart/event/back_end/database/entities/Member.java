package com.smart.event.back_end.database.entities;

import com.smart.event.back_end.database.entities.enums.Gender;

import java.util.List;

public class Member extends User {
    private String brithday ;
    private String phoneNumber ;
    private Gender gender;
    private String country ;
    private String city ;
    private List<Event> favoris;

}
