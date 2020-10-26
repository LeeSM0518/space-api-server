package io.wisoft.smarthumanlifevue;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class MemberController {

  private final MemberService memberService;

  @PostMapping("/login")
  public ResponseToLoginDto login(@Valid @RequestBody RequestToLoginDto requestToLoginDto) {
    return memberService.login(requestToLoginDto);
  }

}
