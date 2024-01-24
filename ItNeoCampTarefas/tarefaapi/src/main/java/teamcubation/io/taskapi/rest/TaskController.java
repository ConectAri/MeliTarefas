package teamcubation.io.taskapi.rest;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import teamcubation.io.taskapi.rest.request.CreateTaskDto;
import teamcubation.io.taskapi.service.TaskService;

@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping("/api/tarefas")


public class TaskController {

    private static final Logger logger = LoggerFactory.getLogger(TaskController.class);

    @Autowired
    private TaskService taskService;


    @GetMapping
    public ResponseEntity getApiStatus() {
        return new ResponseEntity("ON", HttpStatus.OK);


    }

    @PostMapping
    public ResponseEntity<CreateTaskDto> criarTask(@RequestBody CreateTaskDto task) {


        try {
            return ResponseEntity.ok(taskService.criarTask(task));

        } catch (Exception x) {

            logger.error(" Ocorreu um erro ao tentar criar a tarefa.", x);

            return ResponseEntity.internalServerError().build();
        }

    }

//    @GetMapping("/{id}")
//    public ResponseEntity<Task> buscarTaskPorId(@PathVariable Long id) {
//
//
//        try {
//            return ResponseEntity.ok(taskService.buscarPorId(id));
//
//        } catch (Exception x) {
//
//            return ResponseEntity.internalServerError().build();
//        }
//
//    }


}




