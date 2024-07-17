package com.trabalhoSO.TrabalhoDocker.Controllers;

import com.trabalhoSO.TrabalhoDocker.Entities.Tarefa;
import com.trabalhoSO.TrabalhoDocker.Repositories.TarefaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Controller
public class TarefaController {


    @Autowired
    private TarefaRepository repository;


    @GetMapping()
    public ResponseEntity listTasks() {
        List<Tarefa> tarefas = repository.findAll();
        return ResponseEntity.ok().build();
    }

    @PostMapping()
    public ResponseEntity postTask(@RequestBody Tarefa tarefa){
        repository.save(tarefa);
        return ResponseEntity.ok().build();
        }
}
