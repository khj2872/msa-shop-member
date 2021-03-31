package com.msa.shop.member.domain;

import com.msa.shop.member.model.BaseTimeEntity;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Member extends BaseTimeEntity {
    @EmbeddedId
    private MemberId id;

    private String name;

    @Embedded
    private Password password;

    public void initPassword() {
        String newPassword = generateRandomPassword();
        this.password = new Password(newPassword);
    }

    private String generateRandomPassword() {
        return UUID.randomUUID().toString().replace("-", "");
    }

    public void changePassword(String oldPassword, String newPassword) {
        if (!password.match(oldPassword)) {
            throw new IdPasswordNotMatchingException();
        }
        this.password = new Password(newPassword);
    }
}
