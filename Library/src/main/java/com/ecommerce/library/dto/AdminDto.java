package com.ecommerce.library.dto;


import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

@Data @AllArgsConstructor @NoArgsConstructor
public class AdminDto {
    @Size(min = 3,max = 10,message = "Invalid first name!(3-10 characters)")
    private String firstName;
    @Size(min = 3,max = 10,message = "Invalid first name!(3-10 characters)")
    private String lastName;

    private String username;
    @Size(min = 3,max = 10,message = "Invalid password!(3-10 characters)")
    private String password;

    private String repeatPassword;


}
