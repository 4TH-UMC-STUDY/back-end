package umc.project.domain.study;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudyRepository extends JpaRepository<Study, Integer>{
    Study findByName(String name);
}
