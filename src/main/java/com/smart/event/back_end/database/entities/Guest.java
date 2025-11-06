package com.smart.event.back_end.database.entities;

import com.smart.event.back_end.database.entities.enums.InvitationStatus;

public class Guest {
    private String id ;
    private String email ;
    private Member member ;
    private String qrCode ;
    private boolean verified ;
    private InvitationStatus status ;
    private Event event ;
    private  User invitedBy ;
}
