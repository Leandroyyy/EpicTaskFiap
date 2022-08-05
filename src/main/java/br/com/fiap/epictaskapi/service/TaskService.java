package br.com.fiap.epictaskapi.service;

import br.com.fiap.epictaskapi.entity.Task;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {

    public List<Task> listAll(){
        return List.of(
                new Task("Tarefa de exemplo", "Exemplo de tarefas", 10,0 ),
                new Task("Protipo", "protipar interface", 50,0 )
        );
    }
}
