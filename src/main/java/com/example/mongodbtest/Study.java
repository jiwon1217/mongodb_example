package com.example.mongodbtest;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collation = "study")
public class Study {

  @Id
  private String id;
  private String name;
  private int population;


  public Study(String name, int population) {
    this.name = name;
    this.population = population;
  }
}
