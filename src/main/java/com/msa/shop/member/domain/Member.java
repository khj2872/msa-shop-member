package com.msa.shop.member.domain;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Member {
    @EmbeddedId
    private MemberId id;

    private String name;

    @Embedded
    private Password password;

    @Builder
    public Member(MemberId id, String name) {
        this.id = id;
        this.name = name;
    }


}
