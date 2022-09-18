package com.raisetech.namemanagement.entity;

public class HouseholdAccount {

  private int id;

  private String name;

  public HouseholdAccount(int id, String name) {
    this.id = id;
    this.name = name;
  }

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }
}
