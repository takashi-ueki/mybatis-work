package com.raisetech.namemanagement.controller;

import com.raisetech.namemanagement.entity.HouseholdAccount;

public class HouseholdAccountResponse {

  private int id;

  private String name;

  public HouseholdAccountResponse(int id, String name) {
    this.id = id;
    this.name = name;
  }

  public HouseholdAccountResponse(HouseholdAccount householdAccount) {
    this.id = householdAccount.getId();
    this.name = householdAccount.getName();
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
