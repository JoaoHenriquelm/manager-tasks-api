package com.example.managertasks.model;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Task {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String taskName;
	private String deliveryDate;
	private String responsibleTask;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTaskName() {
		return taskName;
	}
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}
	public String getDeliveryDate() {
		return deliveryDate;
	}
	public void setDeliveryDate(String deliveryDate) {
		this.deliveryDate = deliveryDate;
	}
	public String getResponsibleTask() {
		return responsibleTask;
	}
	public void setResponsibleTask(String responsibleTask) {
		this.responsibleTask = responsibleTask;
	}

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", taskName='" + taskName + '\'' +
                ", deliveryDate='" + deliveryDate + '\'' +
                ", responsibleTask='" + responsibleTask + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return Objects.equals(id, task.id) && Objects.equals(taskName, task.taskName) && Objects.equals(deliveryDate, task.deliveryDate) && Objects.equals(responsibleTask, task.responsibleTask);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, taskName, deliveryDate, responsibleTask);
    }
}
