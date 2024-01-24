package teamcubation.io.taskapi.service;

import org.hibernate.ObjectNotFoundException;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import teamcubation.io.taskapi.domain.Task;
import teamcubation.io.taskapi.domain.User;
import teamcubation.io.taskapi.repository.TaskRepository;
import teamcubation.io.taskapi.rest.request.CreateTaskDto;
import teamcubation.io.taskapi.rest.request.UserDto;

import java.nio.channels.FileChannel;
import java.util.Optional;

@Service
public class TaskService {

    @Autowired
    private TaskRepository repository;


    @Autowired
    private ModelMapper mapper;

    public CreateTaskDto criarTask(CreateTaskDto taskDto){
        Task task = mapper.map(taskDto, Task.class);
        User user = mapper.map(taskDto.getUser(), User.class);
        task.setUser(user);
        task = repository.save(task);
        UserDto userDto = mapper.map(task.getUser(), UserDto.class);
        CreateTaskDto newTaskDto = mapper.map(task, CreateTaskDto.class);
        newTaskDto.setUser(userDto);
        return newTaskDto;
    }


//    public CreateTaskDto buscarPorId(Long id) {
//
//
//        return repository.findById(id)
//                .map(task -> mapper.map(task, CreateTaskDto.class))
//                .orElseThrow(() -> new ObjectNotFoundException(id, "Task"));
//
//    }


}




