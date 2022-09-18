package com.raisetech.namemanagement.mapper;

import com.raisetech.namemanagement.entity.HouseholdAccount;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Optional;

@Mapper
public interface HouseholdAccountMapper {

  @Select("SELECT * FROM names")
  List<HouseholdAccount> findAll();

  @Select("SELECT * FROM names WHERE id = #{id}")
  Optional<HouseholdAccount> findById(int id);
}
