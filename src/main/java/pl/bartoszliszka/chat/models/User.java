package pl.bartoszliszka.chat.models;

import lombok.Data;
import org.springframework.web.socket.WebSocketSession;

@Data
public class User {
    private String nickname;
    private WebSocketSession session;

    public User(WebSocketSession session){
        this.session = session;
    }

    public WebSocketSession getSession() {
        return session;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
}