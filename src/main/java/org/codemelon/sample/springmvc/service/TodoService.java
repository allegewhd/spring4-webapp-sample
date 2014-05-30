package org.codemelon.sample.springmvc.service;

import org.codemelon.sample.springmvc.dao.TodoItemDao;
import org.codemelon.sample.springmvc.model.TodoItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by wang on 2014/05/30.
 */
@Service
public class TodoService {

    @Autowired
    private TodoItemDao dao;

    public TodoItem getTodoById(int id) {
        return dao.findByItemId(id);
    }
}
