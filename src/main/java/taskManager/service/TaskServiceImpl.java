package taskManager.service;

import org.springframework.jdbc.core.JdbcTemplate;
import taskManager.dao.Task;
import taskManager.repository.TaskMapper;
import java.util.Random;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class TaskServiceImpl implements TaskService {


    @Autowired
    JdbcTemplate jdbcTemplate;

     @Override
     public Task insertSql() {

        int min = 3;
        int max = 30000;
        int diff = max - min;
        Random random = new Random();
        int rand = random.nextInt(diff + 1) + min;
        String sql = "INSERT INTO bazad(name, timers) VALUES ('Banana', " + rand + ")";
        int tasko = jdbcTemplate.update(sql);
        return null;
  }

     @Override
     public Task deleteSql() {

        String sql1 = "Delete from bazad where name='Banana'";
        int taski = jdbcTemplate.update(sql1);
        return null;
     }

    @Override
    public Task putSql() {

        String sql2 = "UPDATE bazad SET name = 'oneone' WHERE name = 'one'";
        int taskn = jdbcTemplate.update(sql2);
        return null;
    }

    @Override
    public Task findByName(String name) {
       String sql = "SELECT * FROM bazad WHERE name = '" + name + "'";
        Task task = jdbcTemplate.queryForObject(sql, new TaskMapper());
        return task;
    }

    @Override
    public Task find(Long id) {
        String sql = "SELECT * FROM bazad WHERE id = '" + id + "'";
        Task task = jdbcTemplate.queryForObject(sql, new TaskMapper());
        return task;
    }

    @Override
    public List<Task> findAll() {
        String sql = "SELECT * FROM bazad";
        List<Task> taskik = jdbcTemplate.query(sql, new TaskMapper());
        return taskik;
     }

}

