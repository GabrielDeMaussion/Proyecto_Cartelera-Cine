package com.personal.carteleraCine.Dtos.Login;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoginDto {
    private String usuario; //email o dni
    private String clave;
}
