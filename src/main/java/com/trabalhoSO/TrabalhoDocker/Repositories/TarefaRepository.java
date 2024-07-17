package com.trabalhoSO.TrabalhoDocker.Repositories;

import com.trabalhoSO.TrabalhoDocker.Entities.Tarefa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TarefaRepository extends JpaRepository<Tarefa, Long> {


}
