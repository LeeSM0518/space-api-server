package io.wisoft.smarthumanlifevue;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientResponseException;
import org.springframework.web.server.ResponseStatusException;

@Service
@RequiredArgsConstructor
public class MemberService {

  private final MemberRepository memberRepository;

  public void signUp(SignupDto signupDto) {
    Member member = Member.create(signupDto);
    memberRepository.save(member);
  }

  public ResponseToLoginDto login(RequestToLoginDto dto) {
    Member member = memberRepository.findByUsernameAndPassword(dto.getUsername(), dto.getPassword());
    if (member == null)
      throw new ResponseStatusException(HttpStatus.UNAUTHORIZED, "회원을 찾을 수 없습니다");
    return new ResponseToLoginDto(member);
  }

}
