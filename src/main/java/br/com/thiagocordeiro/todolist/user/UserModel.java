package br.com.thiagocordeiro.todolist.user;

import lombok.Data;

@Data
public class UserModel {
  private String username;
  private String name;
  private String password;
}