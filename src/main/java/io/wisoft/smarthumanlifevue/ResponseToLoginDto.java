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

  private String birthday;
  private String department;
  private String phone;
  private String email;
  private String introduction;

  public ResponseToLoginDto(Member member) {
    this.birthday = member.getBirthday();
    this.department = member.getDepartment();
    this.phone = member.getPhone();
    this.email = member.getEmail();
    this.introduction = member.getIntroduction();
  }

}
