package io.wisoft.smarthumanlifevue;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table
@Getter
@ToString
@NoArgsConstructor
public class Member {

  @Id
  @GeneratedValue
  private Long id;

  private String username;
  private String password;
  private String birthday;
  private String department;
  private String phone;
  private String email;
  private String introduction;

  public Member(String username, String password, String birthday, String department,
                String phone, String email, String introduction) {
    this.username = username;
    this.password = password;
    this.birthday = birthday;
    this.department = department;
    this.phone = phone;
    this.email = email;
    this.introduction = introduction;
  }

  public static Member create(SignupDto signupDto) {
    return new Member(
        signupDto.getUsername(),
        signupDto.getPassword(),
        signupDto.getBirthday(),
        signupDto.getDepartment(),
        signupDto.getPhone(),
        signupDto.getEmail(),
        signupDto.getIntroduction());
  }

}
