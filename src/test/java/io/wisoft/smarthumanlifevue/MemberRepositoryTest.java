package io.wisoft.smarthumanlifevue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
@Transactional
public class MemberRepositoryTest {

  @Autowired
  MemberRepository memberRepository;

  @ParameterizedTest
  @CsvSource({
      "nalsm0518, 1234, 1998.05.18, 정보통신공학과, 010-7188-9608, nalsm0518@gmail.com, 안녕하세요!",
  })
  @Rollback(value = false)
  public void signup(String username, String password, String birthday, String department,
                     String phone, String email, String introduction) throws Exception {
    // given
    SignupDto build = SignupDto.builder()
        .username(username)
        .password(password)
        .birthday(birthday)
        .department(department)
        .phone(phone)
        .email(email)
        .introduction(introduction)
        .build();

    // when
    Member member = Member.create(build);
    memberRepository.save(member);

    // then
    Member loginMember = memberRepository.findByUsernameAndPassword(username, password);
    assertNotNull(loginMember);
    assertEquals(birthday, loginMember.getBirthday());
  }

}
