package it.polito.ProvaApi.model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class DataController {

  private String value;

  @PostMapping("/save")
  public void saveValue(@RequestBody String newValue) {
    this.value = newValue;
    System.out.println(newValue);
  }

  @GetMapping("/value")
  public String getValue() {
    return value;
  }
}
