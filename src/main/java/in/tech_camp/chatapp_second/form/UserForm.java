package in.tech_camp.chatapp_second.form;

import lombok.Data;

@Data
public class UserForm {
  private String name;
  private String email;
  private String password;
  private String passwordConfirmation;
}

//新規登録画面に必要なデータを記述