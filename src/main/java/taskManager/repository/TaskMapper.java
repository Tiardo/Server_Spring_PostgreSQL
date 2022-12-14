package taskManager.repository;

import org.springframework.jdbc.core.RowMapper;
import taskManager.dao.Task;

import java.sql.ResultSet;
import java.sql.SQLException;

public class TaskMapper implements RowMapper<Task> {

    @Override
    public Task mapRow(ResultSet rs, int rowNum) throws SQLException {
        Task task = new Task();

        task.setId(rs.getInt("id"));
        task.setName(rs.getString("name"));
        task.setTimers(rs.getInt("timers"));

        return task;
    }
}

