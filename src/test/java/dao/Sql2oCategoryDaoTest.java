//package dao;
//
//import models.Category;
//import models.Task;
//import org.junit.Test;
//
//import static junit.framework.TestCase.*;
//
//public class Sql2oCategoryDaoTest {
//    @Test
//    public void getAllTasksByCategoryReturnsTasksCorrectly() throws Exception {
//        Category category = setupNewCategory();
//        categoryDao.add(category);
//        int categoryId = category.getId();
//        Task newTask = new Task("mow the lawn", categoryId);
//        Task otherTask = new Task("pull weeds", categoryId);
//        Task thirdTask = new Task("trim hedge", categoryId);
//        taskDao.add(newTask);
//        taskDao.add(otherTask); //we are not adding task 3 so we can test things precisely.
//        assertEquals(2, categoryDao.getAllTasksByCategory(categoryId));
//        assertTrue(categoryDao.getAllTasksByCategory(categoryId).contains(newTask));
//        assertTrue(categoryDao.getAllTasksByCategory(categoryId).contains(otherTask));
//        assertFalse(categoryDao.getAllTasksByCategory(categoryId).contains(thirdTask)); //things are accurate!
//    }
//
//    @Test
//    public void getAllTasksByCategoryReturnsTasksCorrectly() throws Exception {
//        Category category = setupNewCategory();
//        categoryDao.add(category);
//        int categoryId = category.getId();
//        Task newTask = new Task("mow the lawn", categoryId);
//        Task otherTask = new Task("pull weeds", categoryId);
//        Task thirdTask = new Task("trim hedge", categoryId);
//        taskDao.add(newTask);
//        taskDao.add(otherTask); //we are not adding task 3 so we can test things precisely.
//        assertEquals(2, categoryDao.getAllTasksByCategory(categoryId));
//        assertTrue(categoryDao.getAllTasksByCategory(categoryId).contains(newTask));
//        assertTrue(categoryDao.getAllTasksByCategory(categoryId).contains(otherTask));
//        assertFalse(categoryDao.getAllTasksByCategory(categoryId).contains(thirdTask)); //things are accurate!
//    }
//}
