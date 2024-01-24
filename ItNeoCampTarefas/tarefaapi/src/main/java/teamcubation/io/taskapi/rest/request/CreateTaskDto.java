package teamcubation.io.taskapi.rest.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import teamcubation.io.taskapi.domain.enums.TaskStatus;

public class CreateTaskDto {

    private Long id;

    @JsonProperty("titulo")
    private String title;

    @JsonProperty("descricao")
    private String description;
    private UserDto user;

    private TaskStatus status;



    CreateTaskDto(Long id, String title, String description, UserDto user, TaskStatus status) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.user = user;
        this.status = status;
    }

    public CreateTaskDto() {

        this.status = TaskStatus.TODO;

    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public TaskStatus getStatus() {
        return status;
    }

    public void setStatus(TaskStatus status) {
        this.status = status;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public UserDto getUser() {
        return user;
    }

    public void setUser(UserDto user) {
        this.user = user;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
