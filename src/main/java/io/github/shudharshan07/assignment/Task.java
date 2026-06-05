package io.github.shudharshan07.assignment;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalTime;

@Getter
@Setter
@Table(name = "task")
@NoArgsConstructor
@AllArgsConstructor
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    String title;

    @Column(name = "task")
    String task;
    LocalTime created_time;
    LocalTime updated_time;

    public Task(String title, String task, LocalTime created_time) {
        this.title = title;
        this.task = task;
        this.created_time = created_time;
    }
}
