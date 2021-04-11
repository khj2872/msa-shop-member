package com.msa.shop.member.api;

import com.msa.shop.member.application.MemberRequest;
import com.msa.shop.member.application.CreateMemberService;
import com.msa.shop.member.domain.MemberId;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/members")
public class MemberController {
    private final CreateMemberService createMemberService;

    @PostMapping
    public String member(@RequestBody MemberRequest memberRequest) {
        MemberId memberId = createMemberService.createMember(memberRequest);
        return memberId.getId();
    }

}
