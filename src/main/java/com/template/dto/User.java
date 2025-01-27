package com.template.dto;


import lombok.Data;

import javax.validation.constraints.*;

@Data
public class User {
    //hibernate-validator
//    @Size()
//    @Future()
//    @Past()
//    @Pattern()
//    @Max()
//    @Min()
    private String uid;
    private String name;
    private String userId;
    private String password;
    private String newPassword;

    @AssertTrue(message = "비밀번호가 다릅니다.")
    private boolean isValid(){
        return this.password.equals(this.newPassword);
    }

}
