package com.msa.shop.member.application;

import com.msa.shop.member.domain.Password;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class MemberRequest {
    private String name;
    private String email;
    private Password password;
}
