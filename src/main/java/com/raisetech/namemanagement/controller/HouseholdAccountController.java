package com.raisetech.namemanagement.controller;

import com.raisetech.namemanagement.service.HouseholdAccountService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HouseholdAccountController {

  private final HouseholdAccountService householdAccountService;

  public HouseholdAccountController(HouseholdAccountService householdAccountService) {
    this.householdAccountService = householdAccountService;
  }


  @GetMapping("/names")
  public List<HouseholdAccountResponse> getNames() {
    return householdAccountService.findAll().stream().map(HouseholdAccountResponse::new).toList();
  }


}
