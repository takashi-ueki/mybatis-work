package com.raisetech.namemanagement.service;

import com.raisetech.namemanagement.entity.Name;

import java.util.List;

public interface NameService {

  List<Name> findAll();

  // idに指定した名前が存在しない場合に例外をthrowします
  Name findById(int id) throws Exception;

  void create(String name);

  // idに指定した名前が存在しない場合に例外をthrowします
  void update(int id, String name) throws Exception;

}
