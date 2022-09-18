package com.raisetech.namemanagement.service;

import com.raisetech.namemanagement.entity.HouseholdAccount;
import com.raisetech.namemanagement.mapper.HouseholdAccountMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HouseholdAccountServiceImpl implements HouseholdAccountService {

  private HouseholdAccountMapper householdAccountMapper;

  public HouseholdAccountServiceImpl(HouseholdAccountMapper householdAccountMapper) {
    this.householdAccountMapper = householdAccountMapper;
  }

  @Override
  public List<HouseholdAccount> findAll() {
    return householdAccountMapper.findAll();
  }

  @Override
  public HouseholdAccount findById(int id) throws Exception {
    return null;
  }

  @Override
  public void create(String name) {

  }

  @Override
  public void update(int id, String name) throws Exception {

  }
}
