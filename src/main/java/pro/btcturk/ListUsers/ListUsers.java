package pro.btcturk.ListUsers;

import io.restassured.mapper.ObjectMapperType;
import pro.btcturk.base.BaseAPI;

import java.util.HashMap;
import java.util.Map;

public class ListUsers extends BaseAPI {


        public ListUsersResponseParameter getListUsersWithPageParameter(int pageNumber) {
            Map<String, Integer> query = new HashMap<>();
            query.put("page", pageNumber);
            return getWithQueryParameters(USERS_LIST_PATH, query)
                    .then()
                    .extract()
                    .as(ListUsersResponseParameter.class, ObjectMapperType.GSON);
        }
}
