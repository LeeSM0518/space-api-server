package io.wisoft.smarthumanlifevue;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RequestToLoginDto {

  @NotBlank(message = "username is null!")
  private String username;
  @NotBlank(message = "password is null!")
  private String password;

}
