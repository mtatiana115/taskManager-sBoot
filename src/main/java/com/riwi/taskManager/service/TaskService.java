package com.riwi.taskManager.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.riwi.taskManager.entity.Task;
import com.riwi.taskManager.repository.TaskRepository;

@Service
public class TaskService {

  //inyección de dependencias @Autowired
  @Autowired
  private TaskRepository objTaskRepository;

  //Creo los métodos 
//1. Listar todas las tareas
  public List<Task> findAll(){
    return this.objTaskRepository.findAll();
  }

//2. crear una tarea
public Task insert(Task objTask){
  return this.objTaskRepository.save(objTask);
}

//3. obtener el id
public Task findById(Long id){
  return this.objTaskRepository.findById(id).orElse(null);
}

//4. Actualizar una tarea
public Task update(Long id,Task objTask){
  //buscar tarea por id
  Task taskDB = this.findById(id);
  //verificar que si exista
  if (taskDB == null) return null;
  //actualizar la tarea antigüa
  taskDB = objTask;
  //guardarlo
  return this.objTaskRepository.save(taskDB);
}

//5. Eliminar una tarea
public void delete(Long id){
  this.objTaskRepository.deleteById(id);
}

//6. Listar las tareas de forma paginada
public Page<Task> findPaginated(int page, int size){
  if (page < 0) {
    page = 1;
  }
  //Crear el obj de paginación
  Pageable objPageable = PageRequest.of(page, size);
  return this.objTaskRepository.findAll(objPageable);
}
}
