package com.vue.databinding;

/**
 * The Class Employee.
 */
public class Employee {
  
  /** The id. */
  public int   id;

  /** The first name. */
  public String firstName;

  /** The last name. */
  public String lastName;

  /** The department. */
  public String department;

  /**
   * Instantiates a new employee.
   *
   * @param id the id
   * @param firstName the first name
   * @param lastName the last name
   * @param department the department
   */
  public Employee(int id, String firstName, String lastName, String department) {
    super();
    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
    this.department = department;
  }

  /**
   * Gets the id.
   *
   * @return the id
   */
  public int getId() {
    return id;
  }

  /**
   * Sets the id.
   *
   * @param id the new id
   */
  public void setId(int id) {
    this.id = id;
  }

  /**
   * Gets the first name.
   *
   * @return the first name
   */
  public String getFirstName() {
    return firstName;
  }

  /**
   * Sets the first name.
   *
   * @param firstName the new first name
   */
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  /**
   * Gets the last name.
   *
   * @return the last name
   */
  public String getLastName() {
    return lastName;
  }

  /**
   * Sets the last name.
   *
   * @param lastName the new last name
   */
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  /**
   * Gets the department.
   *
   * @return the department
   */
  public String getDepartment() {
    return department;
  }

  /**
   * Sets the department.
   *
   * @param department the new department
   */
  public void setDepartment(String department) {
    this.department = department;
  }

}
