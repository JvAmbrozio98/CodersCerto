package com.example.CodersCerto.repositories;

import com.example.CodersCerto.models.TaskModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TasksRepository extends JpaRepository <TaskModel, Long> {
    Optional <TaskModel> findById (Long id);
}
