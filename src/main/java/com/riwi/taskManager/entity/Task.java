package com.riwi.taskManager.entity;

import java.time.LocalDate;
import java.time.LocalTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

  //atributos
  //marcar entity
  @Entity
  //marcar tabla
  @Table(name = "Task")
public class Task {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(length = 100, nullable = false)
  private String title;

  @Column(length = 255, nullable = true)
  private String description;

  @Column(nullable = false)
  private LocalDate creationDate;

  @Column(nullable = false)
  private LocalTime creationTime;

  @Column(length = 50, nullable = false)
  private String status;

    //Constructor
  public Task(Long id, String title, String description, LocalDate creationDate, LocalTime creationTime,
      String status) {
    this.id = id;
    this.title = title;
    this.description = description;
    this.creationDate = creationDate;
    this.creationTime = creationTime;
    this.status = status;
  }

    //GETTERS AND SETTERS

  public Task() {
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public LocalDate getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(LocalDate creationDate) {
    this.creationDate = creationDate;
  }

  public LocalTime getCreationTime() {
    return creationTime;
  }

  public void setCreationTime(LocalTime creationTime) {
    this.creationTime = creationTime;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

    //to string
  @Override
  public String toString() {
    return "Task [id=" + id + ", title=" + title + ", description=" + description + ", creationDate=" + creationDate
        + ", creationTime=" + creationTime + ", status=" + status + "]";
  }  

}

