package com.ontrack.test;

import org.junit.jupiter.api.Test;

import com.ontrack.main.OnTrackTaskService;
import com.ontrack.main.Task;

import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class OnTrackTaskServiceTest {

    @Test
    public void testGetTaskInbox() {
        OnTrackTaskService service = new OnTrackTaskService();
        List<Task> tasks = service.getTaskInboxByStudentId("123");
        assertNotNull(tasks);
        assertEquals(2, tasks.size());
    }
}
