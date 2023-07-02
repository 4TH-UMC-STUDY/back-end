package umc.project.member;

import org.springframework.data.jpa.repository.JpaRepository;
import umc.project.member.Member;

public interface MemberRepository extends JpaRepository<Member,Long> {
}
