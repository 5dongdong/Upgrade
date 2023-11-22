package com.example.upgrade.domain.user;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;

import java.time.LocalDate;

@Entity
@Getter
public class User {

  @Id
  @Column(name = "id")
  Long userId; // 회원번호 pk;

  @Column(name = "login_id")
  String id; // 로그인 id;

  @Column(name = "nick_name")
  String nickName;

  @Column(name = "name")
  String name;

  @Column(name = "password")
  String password;

  @Column(name = "gender")
  Gender gender;

  @Column(name = "birth")
  LocalDate birth;

}
