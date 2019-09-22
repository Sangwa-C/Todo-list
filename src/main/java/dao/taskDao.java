package dao;

import models.Task;
import java.util.List;

public interface taskDao {

    // LIST
    List<Task> getAll();

    // CREATE
    static void add(Task task);

    // READ
    Task findById(int id);

    // UPDATE
    void update(int id, String content, int categoryId);

    // void update(int id, String content);

    // DELETE
    // void deleteById(int id);
    // void clearAllTasks();
}