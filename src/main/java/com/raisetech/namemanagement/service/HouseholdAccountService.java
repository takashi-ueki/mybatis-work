package com.raisetech.namemanagement.service;

import com.raisetech.namemanagement.entity.HouseholdAccount;

import java.util.List;

public interface HouseholdAccountService {

  List<HouseholdAccount> findAll();

  // idに指定した名前が存在しない場合に例外をthrowします
  HouseholdAccount findById(int id) throws Exception;

  void create(String name);

  // idに指定した名前が存在しない場合に例外をthrowします
  void update(int id, String name) throws Exception;

}
