package com.example.behavioral.mediator;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class User {

    private String name;

    void sendMessage(String message) {
        chatRoom.showMessage(this, message);
    }
}
