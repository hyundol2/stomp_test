package com.stomp.stompchat.domain.chat;


import jakarta.persistence.*;
import lombok.Getter;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "chat_room")
@Getter
public class ChatRoom {

    @Id
    @GeneratedValue
    @Column(name = "chat_room_id")
    private int id; //채팅방 id

    @Column(name = "created_at")
    private LocalDateTime createdAt; //생성일자

    @OneToMany(mappedBy = "chatRoom"/*, cascade = CascadeType.ALL*/)
    private List<ChatMessage> chatMessages = new ArrayList<>(); //채팅

    @OneToMany(mappedBy = "chatRoom")
    private List<ChatRoomUser> chatRoomUsers; // 채팅방 입장 유저

}
