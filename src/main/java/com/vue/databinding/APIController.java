package com.vue.databinding;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(maxAge = 3600)
public class APIController {

  @Autowired
  private EmployeeStorage storage;

  @GetMapping("/api/employee")
  public Employee getEmployee() {
    return storage.getRandomEmployee();
  }
  
  @GetMapping("/api/employee/{id}")
  public Employee getEmployee(@PathVariable("id") int id) {
    return storage.getEmployee(id);
  }

}
