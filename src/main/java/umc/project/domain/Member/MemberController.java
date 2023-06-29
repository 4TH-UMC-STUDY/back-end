package umc.project.domain.Member;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import umc.project.domain.Member.dto.MemberRequestDto.Register;

@RestController
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;
    @PostMapping("/member")
    public ResponseEntity<Integer> registerMember(@RequestBody Register register){ //dto를 바디로 만듦
        memberService.registerMember(register);
        return new ResponseEntity<>(200, HttpStatus.OK);
    }


}
