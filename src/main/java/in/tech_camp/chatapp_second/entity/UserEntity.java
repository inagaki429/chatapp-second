package in.tech_camp.chatapp_second.entity;

import lombok.Data;

@Data
public class UserEntity {
  private Integer id;
  private String name;
  private String email;
  private String password;
}
