package com.rscinema.finalproject.domain.dto;


import lombok.*;

import java.time.LocalDate;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {
    private Integer id;
    private String firstName;
    private String lastName;
    private String email;
    private String gender;
    private String password;
    private Integer age;
    private String role;
    private String phoneNumber;
}
