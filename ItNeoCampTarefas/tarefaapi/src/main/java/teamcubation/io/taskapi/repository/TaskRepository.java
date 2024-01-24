package teamcubation.io.taskapi.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import teamcubation.io.taskapi.domain.Task;

@Repository
public interface TaskRepository extends JpaRepository <Task, Long>{

}
