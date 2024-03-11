package in.sai.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.sai.entity.StudentEntity;

public interface StudentRepository extends JpaRepository<StudentEntity, Integer> {

}
