package net.leloubil.clonecordserver.authentication;


import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.data.annotation.Id;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.UUID;


/**
 * Class to represent data needed to login or register
 */
@Data @NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class AuthUser {

    @Id
    UUID uuid;

    @NotNull
    String email;

    @NotNull
    @ValidPassword
    String password;

}
