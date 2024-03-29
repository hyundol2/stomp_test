package com.stomp.stompchat.domain.chat;

import com.stomp.stompchat.domain.user.User;
import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Table(name = "chat_room_user")
@Getter
public class ChatRoomUser {
    /*
     * 채팅방 - 유저 입장관리 중개테이블
     */
    @Id
    @GeneratedValue
    @Column(name = "chat_room_user_id")
    private int id; //채팅방 입장관리 id

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "chat_room_id")
    private ChatRoom chatRoom; // 채팅방
}
