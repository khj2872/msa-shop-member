package com.msa.shop.member.domain;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Password {
    @Column(name = "password")
    private String value;

    public Password(String password) {
        this.value = password;
    }

    public boolean match(String password) {
        return this.value.equals(password);
    }
}
