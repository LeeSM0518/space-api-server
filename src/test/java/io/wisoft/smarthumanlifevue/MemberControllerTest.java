//package io.wisoft.smarthumanlifevue;
//
//import com.fasterxml.jackson.databind.ObjectMapper;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.junit.jupiter.params.ParameterizedTest;
//import org.junit.jupiter.params.provider.CsvSource;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.MediaType;
//import org.springframework.test.context.junit.jupiter.SpringExtension;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.MvcResult;
//import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//@ExtendWith(SpringExtension.class)
//@WebMvcTest
//public class MemberControllerTest {
//
//  @Autowired
//  private MockMvc mockMvc;
//  @Autowired
//  private ObjectMapper objectMapper;
//
//  @MockBean
//  MemberService memberService;
//
//  @ParameterizedTest
//  @CsvSource({
//      "nalsm98, 1234, 1998.05.18, 정보통신공학과, 010-7188-9608, nalsm0518@gmail.com, 안녕하세요!",
//  })
//  public void login(String username, String password, String birthday, String department,
//                     String phone, String email, String introduction) throws Exception {
//    // given
////    SignupDto build = SignupDto.builder()
////        .username(username)
////        .password(password)
////        .birthday(birthday)
////        .department(department)
////        .phone(phone)
////        .email(email)
////        .introduction(introduction)
////        .build();
////    memberService.signUp(build);
//
//    RequestToLoginDto requestToLoginDto = RequestToLoginDto.builder()
//        .username(username)
//        .password(password)
//        .build();
//
//    // when
//    MvcResult result = mockMvc.perform(MockMvcRequestBuilders.post("/login")
//    .contentType(MediaType.APPLICATION_JSON)
//    .accept(MediaType.APPLICATION_JSON)
//    .characterEncoding("UTF-8")
//    .content(objectMapper.writeValueAsString(requestToLoginDto)))
//        .andReturn();
//
//    // then
//    int status = result.getResponse().getStatus();
//    assertEquals(HttpStatus.OK.value(), status);
//    ResponseToLoginDto responseToLoginDto =
//        objectMapper.readValue(result.getResponse().getContentAsString(), ResponseToLoginDto.class);
//    assertEquals(birthday, responseToLoginDto.getBirthday());
//  }
//
//
//
//}
