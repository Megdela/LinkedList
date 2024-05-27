package Task_Manager;

 class Main {
     public static void main(String[] args) {
         TaskManager taskManager = new TaskManager();
         taskManager.addTask(new Task("Task 1", "Study DSA"));
         taskManager.addTask(new Task("Task 2", "Do DSA project"));
         taskManager.addTask(new Task("Task 3", "Go to church"));
         taskManager.markTaskAsComplted("Task 1");
         taskManager.viewTasks();
     }
}
