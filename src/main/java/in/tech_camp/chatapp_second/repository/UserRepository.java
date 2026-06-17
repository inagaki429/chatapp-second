package in.tech_camp.chatapp_second.repository;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

import in.tech_camp.chatapp_second.entity.UserEntity;

@Mapper
public interface UserRepository {
  @Insert("INSERT INTO users (name, email, password) VALUES (#{name}, #{email}, #{password})")
  @Options(useGeneratedKeys = true, keyProperty = "id")
  void insert(UserEntity user);

  // DBに保存、戻り値はなし
  @Select("SELECT * FROM users WHERE email = #{email}")
  UserEntity findByEmail(String email);

}
