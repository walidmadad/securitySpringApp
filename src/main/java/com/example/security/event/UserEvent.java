package com.example.security.event;


import com.example.security.entity.UserEntity;
import com.example.security.enums.EventType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Map;

@Getter
@Setter
@AllArgsConstructor
public class UserEvent {
    private UserEntity user;
    private EventType Type;
    private Map<?,?> data;

}
