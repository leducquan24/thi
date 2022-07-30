package com.example.asm.entity.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class AccountRegisterDto {
    private long id;
    private String username;
    private String password;
    private String confirmPassword;
    private int role;
}
