package com.ontrack.main;
import java.util.*;

public class OnTrackTaskService {
    public List<Task> getTaskInboxByStudentId(String studentId) {
        List<Task> tasks = new ArrayList<>();
        tasks.add(new Task("T001", "Database Assignment", "Submitted"));
        tasks.add(new Task("T002", "Java Project", "Marked"));
        return tasks;
    }
}
