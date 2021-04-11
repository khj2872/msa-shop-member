package com.msa.shop.member.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.UUID;

@Embeddable
@Getter
@EqualsAndHashCode
public class MemberId implements Serializable {
    @Column(name = "member_id")
    private String id;

    public MemberId() {
        this.id = generateRandomMemberId();
    }

    public String generateRandomMemberId() {
        return UUID.randomUUID().toString().replace("-", "");
    }
}
