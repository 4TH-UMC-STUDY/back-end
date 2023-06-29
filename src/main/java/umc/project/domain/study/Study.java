package umc.project.domain.study;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import umc.project.domain.Member.Member;

import java.util.List;

@Entity
@Getter
@NoArgsConstructor
public class Study {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int studyId; //db조회시 _

    @Column(nullable = false, unique = true)
    private String name;

    @Column(nullable = false)
    private String part;

    @OneToMany(mappedBy = "study") //주의할 점 : table에는 소문자로 들어감. 연관관계의 주인이 아님, study에서 member수정 불가
    private List<Member> memberList;



}
