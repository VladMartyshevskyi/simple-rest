package com.vue.databinding;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

@Service
public class EmployeeStorage {

  private List<Employee> storage = new ArrayList<>();

  private Random         rand    = new Random();

  public Employee getRandomEmployee() {
    return storage.get(rand.nextInt(storage.size()));
  }

  @PostConstruct
  public void init() {
    storage.add(new Employee(0, "John", "Smith", "Marketing"));
    storage.add(new Employee(1, "Jain", "Black", "ITOP"));
    storage.add(new Employee(2, "Mary", "White", "Sales"));
    storage.add(new Employee(3, "Jack", "Dark", "Marketing"));
    storage.add(new Employee(4, "Neville", "Cress", "ITOP"));
    storage.add(new Employee(5, "Stephan", "Leonard", "Sales"));
    storage.add(new Employee(6, "Daniel", "Jensen", "Sales"));
    storage.add(new Employee(7, "Willow", "Jewel", "Marketing"));
    storage.add(new Employee(8, "Madge", "Madron", "Sales"));
    storage.add(new Employee(9, "Shawn", "Waster", "ITOP"));
    storage.add(new Employee(10, "Alex", "Yellow", "Marketing"));
    storage.add(new Employee(11, "Matthew", "Greenwood", "Marketing"));
    storage.add(new Employee(12, "Daniel", "Dark", "Sales"));
  }

  public Employee getEmployee(int id) {
    if (id > (storage.size() - 1) || id < 0) {
      return null;
    }
    return storage.get(id);
  }

}
