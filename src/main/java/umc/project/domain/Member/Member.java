package umc.project.domain.Member;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import umc.project.domain.study.Study;

@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED) //생성자사용가능
@AllArgsConstructor //모든 필드를 가진 생성자 가능
public class Member { //entity는 private

    @Id //pk라는 뜻
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String name;
    @Column(nullable = false, unique = true)
    private String nickName;

    @Column(nullable = false)
    private boolean sex; //0:female, 1:male

    @ManyToOne(fetch = FetchType.LAZY) //eager-study정보까지 lazy-study접근시에만(one으로 끝날시)
    @JoinColumn(name = "study_id")
    private Study study;

}

