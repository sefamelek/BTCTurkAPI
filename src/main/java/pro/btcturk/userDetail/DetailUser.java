package pro.btcturk.userDetail;

import io.restassured.mapper.ObjectMapperType;
import pro.btcturk.base.BaseAPI;
import pro.btcturk.config.Var;

import static pro.btcturk.config.Var.USERS_PATH;

public class DetailUser  extends BaseAPI {


        public UserDetailResponseParameters getUserWithId(String userNo) {
            return get(USERS_PATH  + userNo)
                    .then()
                    .extract()
                    .as(UserDetailResponseParameters.class, ObjectMapperType.GSON);
        }

    }
