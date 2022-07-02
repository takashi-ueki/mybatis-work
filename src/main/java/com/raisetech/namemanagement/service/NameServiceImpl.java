package com.raisetech.namemanagement.service;

import com.raisetech.namemanagement.entity.Name;
import com.raisetech.namemanagement.mapper.NameMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NameServiceImpl implements NameService {

  private NameMapper nameMapper;

  public NameServiceImpl(NameMapper nameMapper) {
    this.nameMapper = nameMapper;
  }

  @Override
  public List<Name> findAll() {
    return nameMapper.findAll();
  }
}
