package pro.btcturk.createUser;

import lombok.Builder;

@Builder
public class CreateUserRequest {
    public String name;
    public String job;
}
