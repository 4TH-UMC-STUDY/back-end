package umc.project.member;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import umc.project.team.Team;
import umc.project.utils.BaseTimeEntity;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
public class Member extends BaseTimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column (unique = true)
    private String name;
    private String email;

    @ManyToOne(fetch = FetchType.LAZY)
    private Team team;

    public Member(String name, String email){
        this.name = name;
        this.email = email;
    }

    public void updateMember(String name, String email){
        this.name = name != null ? name : this.name;
        this.email = email != null ? email : this.email;
    }

    public void addTeam(Team team){
        this.team = team;
        
    }


}
