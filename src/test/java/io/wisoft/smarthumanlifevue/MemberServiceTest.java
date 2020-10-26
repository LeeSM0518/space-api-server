//package io.wisoft.smarthumanlifevue;
//
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.params.ParameterizedTest;
//import org.junit.jupiter.params.provider.CsvSource;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.transaction.annotation.Transactional;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//@SpringBootTest
//@Transactional
//public class MemberServiceTest {
//
//  @Autowired
//  MemberService memberService;
//
//  @ParameterizedTest
//  @CsvSource({
//      "nalsm98, 1234, 1998.05.18, 정보통신공학과, 010-7188-9608, nalsm0518@gmail.com, 안녕하세요!",
//  })
//  public void signup(String username, String password, String birthday, String department,
//                     String phone, String email, String introduction) throws Exception {
//    // given
//    SignupDto build = SignupDto.builder()
//        .username(username)
//        .password(password)
//        .birthday(birthday)
//        .department(department)
//        .phone(phone)
//        .email(email)
//        .introduction(introduction)
//        .build();
//
//    RequestToLoginDto requestToLoginDto = RequestToLoginDto.builder()
//        .username(username)
//        .password(password)
//        .build();
//
//    // when
//    memberService.signUp(build);
//
//    // then
//    ResponseToLoginDto login = memberService.login(requestToLoginDto);
//    assertEquals(birthday, login.getBirthday());
//  }
//
//}
