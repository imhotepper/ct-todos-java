package com.todos.api.models;

import lombok.*;
import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Length;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
@Data
public class Todo {
    @Id @GeneratedValue
    private int Id;
    @NotNull
    @Length(min = 2,message = "Min length allowed is 2")
    private String title;
    private boolean isCompleted;
}
