package com.stomp.stompchat.domain.user;

import com.stomp.stompchat.domain.chat.ChatMessage;
import com.stomp.stompchat.domain.chat.ChatRoomUser;
import jakarta.persistence.*;
import lombok.Getter;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "user")
@Getter
public class User {

    @Id
    @GeneratedValue
    @Column(name = "user_id")
    private int id; //회원 id

    private String email; //이메일

    /* chat entity */
    @OneToMany(mappedBy = "user")
    private List<ChatMessage> chatMessages = new ArrayList<>();

    @OneToMany(mappedBy = "user")
    private List<ChatRoomUser> chatRoomUsers = new ArrayList<>();
}
