package com.example.SpringJWT.Entity;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class User {
    private String user_Id;
    private String user_Name;
    private String user_Email;
}
