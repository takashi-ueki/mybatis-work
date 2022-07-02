package com.raisetech.namemanagement.controller;

import com.raisetech.namemanagement.service.NameService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Map;

@RestController
public class NameController {

  private final NameService nameService;

  public NameController(NameService nameService) {
    this.nameService = nameService;
  }

  @PostMapping("/names")
  public ResponseEntity<String> create(@RequestBody CreateForm form) {
    // 登録処理は省略
    URI url = UriComponentsBuilder.fromUriString("http://localhost:8080")
        .path("/names/id") // id部分は実際に登録された際に発行したidを設定する
        .build()
        .toUri();
    return ResponseEntity.created(url).body("name successfully created");
  }

  @GetMapping("/names")
  public List<NameResponse> getNames() {
    return nameService.findAll().stream().map(NameResponse::new).toList();
  }

  @PatchMapping("/names/{id}")
  public ResponseEntity<Map<String, String>> update(@RequestBody CreateForm form, @PathVariable("id") int id) {
    // 更新処理は省略
    // 引数のidに
    return ResponseEntity.ok(Map.of("message", "name successfully updated"));
  }

  @DeleteMapping("/names/{id}")
  public Map<String, String> delete(@PathVariable("id") int id) {
    return Map.of("message", "IDが" + id + "の名前を削除しました。");
  }

  public static class CreateForm {

    private String name;

    public String getName() {
      return name;
    }

    public void setName(String name) {
      this.name = name;
    }
  }

  public static class UpdateForm {

    private String name;

    public String getName() {
      return name;
    }

    public void setName(String name) {
      this.name = name;
    }
  }
}
