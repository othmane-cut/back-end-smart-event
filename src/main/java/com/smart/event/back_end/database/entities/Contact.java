package com.smart.event.back_end.database.entities;

import lombok.Data;

public class Contact {
    private String id ;
    private String message ;
    private Data date ;
    private Member user ;
}
