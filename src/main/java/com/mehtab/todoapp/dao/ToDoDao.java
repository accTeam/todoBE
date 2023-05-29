package com.mehtab.todoapp.dao;

import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Repository;

import com.mehtab.todoapp.model.ToDo;

@Repository
public interface ToDoDao {
	List<ToDo> listAll();
	
	ToDo create(ToDo toDo);
	
	ToDo update(ToDo toDo);
	
	void deleteByIds(Set<Integer> ids);
}
