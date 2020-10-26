package io.wisoft.smarthumanlifevue;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {

  Member findByUsernameAndPassword(String username, String password);

  Member findByUsername(String username);

}
