package com.portfolio.siron.event;

import org.springframework.context.ApplicationEvent;

public class ContactEvent extends ApplicationEvent {

    public ContactEvent(Object source) {
        super(source);
    }
}
