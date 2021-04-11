package com.msa.shop.member.application;

import com.msa.shop.member.domain.Member;
import com.msa.shop.member.domain.MemberId;
import com.msa.shop.member.domain.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CreateMemberService {
    private final MemberRepository memberRepository;

    public MemberId createMember(MemberRequest memberRequest) {
        Member member = new Member(
                new MemberId(),
                memberRequest.getName(),
                memberRequest.getEmail(),
                memberRequest.getPassword());
        return memberRepository.save(member).getId();
    }
}
