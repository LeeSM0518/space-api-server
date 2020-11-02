package io.wisoft.smarthumanlifevue;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@AutoConfigureMockMvc
public class MemberControllerTest {

  @Autowired
  private MockMvc mockMvc;
  @Autowired
  private ObjectMapper objectMapper;


  @ParameterizedTest
  @CsvSource({
      "nalsm12, 이상민, 1234, 1998.05.18, 정보통신공학과, 010-7188-9608, nalsm0518@gmail.com, 안녕하세요!",
  })
  @Rollback(value = false)
  public void login(String username, String name, String password, String birthday, String department,
                     String phone, String email, String introduction) throws Exception {
    // given
    SignupDto build = SignupDto.builder()
        .username(username)
        .name(name)
        .password(password)
        .birthday(birthday)
        .department(department)
        .phone(phone)
        .email(email)
        .introduction(introduction)
        .build();

    RequestToLoginDto requestToLoginDto = RequestToLoginDto.builder()
        .username(username)
        .password(password)
        .build();

    // when
    MvcResult signupResult = mockMvc.perform(MockMvcRequestBuilders.post("/signup")
    .contentType(MediaType.APPLICATION_JSON)
    .accept(MediaType.APPLICATION_JSON)
    .characterEncoding("UTF-8")
    .content(objectMapper.writeValueAsString(build)))
        .andReturn();

    // then
    int status = signupResult.getResponse().getStatus();
    assertEquals(HttpStatus.OK.value(), status);

    MvcResult loginResult = mockMvc.perform(MockMvcRequestBuilders.post("/login")
        .contentType(MediaType.APPLICATION_JSON_UTF8_VALUE)
        .accept(MediaType.APPLICATION_JSON_UTF8_VALUE)
        .characterEncoding("UTF-8")
        .content(objectMapper.writeValueAsString(requestToLoginDto)))
        .andReturn();

    ResponseToLoginDto responseToLoginDto =
        objectMapper.readValue(loginResult.getResponse().getContentAsString(), ResponseToLoginDto.class);
    assertEquals(name, responseToLoginDto.getName());
  }



}
