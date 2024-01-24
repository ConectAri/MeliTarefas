package teamcubation.io.taskapi.domain;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tb_user")
public class User {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String team;



    public User(String name, String team) {
        this.name = name;
        this.team = team;
    }

    public User() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }
}
