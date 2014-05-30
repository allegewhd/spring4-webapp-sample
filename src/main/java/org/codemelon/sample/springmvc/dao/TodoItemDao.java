package org.codemelon.sample.springmvc.dao;

import org.codemelon.sample.springmvc.model.TodoItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * Created by wang on 2014/05/30.
 */
@Repository
public class TodoItemDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;


    public TodoItem findByItemId(int id) {
        String sql = "select * from TodoItem where id = ?";
        TodoItem result = jdbcTemplate.queryForObject(
                sql, new Object[]{id}, new BeanPropertyRowMapper<TodoItem>(TodoItem.class));

        return result;
    }
}
