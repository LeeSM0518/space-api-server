package io.wisoft.smarthumanlifevue;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ResponseToLoginDto {

  private String name;
  private String department;
  private String email;
  private String birthday;
  private String phone;
  private String introduction;

  public ResponseToLoginDto(Member member) {
    this.name = member.getName();
    this.birthday = member.getBirthday();
    this.department = member.getDepartment();
    this.phone = member.getPhone();
    this.email = member.getEmail();
    this.introduction = member.getIntroduction();
  }

}
