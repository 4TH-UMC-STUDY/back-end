package umc.project.domain.Member;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import umc.project.domain.Member.dto.MemberRequestDto;
import umc.project.domain.study.Study;
import umc.project.domain.study.StudyRepository;

@Service
@RequiredArgsConstructor
public class MemberService {

    //db선언
    private final MemberRepository memberRepository;
    private final StudyRepository studyRepository;

    @Transactional
    public void registerMember(MemberRequestDto.Register register){
        Member member = new Member(register.getName(), register.getNickName(), register.isSex() );
        Study study = studyRepository.findByName(register.getStudyName());
        member.addStudy(study);

        memberRepository.save(member); //db에 멤버넎기
    }

}
