package io.wisoft.smarthumanlifevue;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import java.util.Date;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SignupDto {


  @NotBlank(message = "username is null!")
  private String username;
  @NotBlank(message = "name is null!")
  private String name;
  @NotBlank(message = "password is null!")
  private String password;
  @NotBlank(message = "birthday is null!")
  private String birthday;
  @NotBlank(message = "department is null!")
  private String department;
  @NotBlank(message = "phone is null!")
  private String phone;
  @NotBlank(message = "email is null!")
  private String email;
  @NotBlank(message = "introduction is null!")
  private String introduction;

}
