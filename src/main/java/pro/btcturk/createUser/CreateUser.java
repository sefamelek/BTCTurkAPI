package pro.btcturk.createUser;

import io.restassured.mapper.ObjectMapperType;
import pro.btcturk.base.BaseAPI;

import static pro.btcturk.config.Var.USERS_POST_PATH;

public class CreateUser extends BaseAPI {


    public CreateUserResponseParameter createUser(String name, String job) {
        CreateUserRequest createUserRequest = CreateUserRequest.builder()
                .name(name)
                .job(job)
                .build();

        return post(USERS_POST_PATH, createUserRequest)
                .then()
                .extract()
                .as(CreateUserResponseParameter.class, ObjectMapperType.GSON);
    }
}
