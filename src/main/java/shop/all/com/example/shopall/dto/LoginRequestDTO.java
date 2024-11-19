package shop.all.com.example.shopall.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

// LoginRequest.java
@Getter
@Setter
@Data
public class LoginRequestDTO {
    private String email;
    private String password;

    // Getters and setters
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
