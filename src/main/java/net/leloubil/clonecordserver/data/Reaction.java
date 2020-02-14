package net.leloubil.clonecordserver.data;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import javax.validation.constraints.NotNull;
import java.util.UUID;
@Data
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Reaction {

    /*Not sure how to store emotes and allows users to use other guilds emotes*/
    @NotNull
    long emoteId;

    @NotNull
    UUID authorUuid;
}
