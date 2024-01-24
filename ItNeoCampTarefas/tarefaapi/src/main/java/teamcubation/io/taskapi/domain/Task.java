package teamcubation.io.taskapi.domain;

import jakarta.persistence.*;
import teamcubation.io.taskapi.domain.enums.TaskStatus;


@Entity
@Table(name="tb_task")
public class Task {

    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private String description;
    private TaskStatus status;

    @ManyToOne(cascade=CascadeType.PERSIST)
    @JoinColumn(name= "user_id", referencedColumnName = "id")
    private User user;

    public Task(Long id, String title, String description, TaskStatus status, User user) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.status = status;
        this.user = user;
    }

    public Task() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public TaskStatus getStatus() {
        return status;
    }

    public void setStatus(TaskStatus status) {
        this.status = status;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

}