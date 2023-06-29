package umc.project.domain.Member.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

public class MemberRequestDto {
    @Getter
    @AllArgsConstructor
    public static class Register{ //study 목넣음
        private String name;
        private String nickName;
        private boolean sex;
        private String studyName;
    }

}
