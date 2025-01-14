package vn.edu.iuh.fit.auth;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import vn.edu.iuh.fit.user.Role;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RegisterRequest {
  private Integer id;
  private String firstname;
  private String lastname;
  private String email;
  private String password;
  private Role role;
}
