package com.generic.demo.Enum;

/**
 * @author Gamze on 21.10.2019
 *
 */

public enum EnumUserRole {

  ADMIN(1, "Admin"), USER(2, "User");

  private int code;

  private String description;

  EnumUserRole(int code, String description) {
    this.code = code;
    this.description = description;
  }
}