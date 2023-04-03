package com.example.mongodbtest;

import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/study")
public class MongoDbController {

  private final MongoDbRepository mongoDbRepository;

  @PostMapping
  public Study studies(@RequestBody Study study) {
    return mongoDbRepository.save(study);
  }

}
