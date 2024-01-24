package teamcubation.io.taskapi.rest.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import teamcubation.io.taskapi.domain.enums.TaskStatus;

public class UpdateTaskDto {


    private Integer id;

    @JsonProperty("titulo")
    private String title;

    @JsonProperty("descricao")
    private String description;

    private UserDto user;
    private TaskStatus status;

    UpdateTaskDto(String title, String description, UserDto user) {
        this.title = title;
        this.description = description;
        this.user = user;
    }

    public UpdateTaskDto() {}

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

    public TaskStatus getStatus() {
        return status;
    }

    public void setStatus(TaskStatus status) {
        this.status = status;
    }
}
