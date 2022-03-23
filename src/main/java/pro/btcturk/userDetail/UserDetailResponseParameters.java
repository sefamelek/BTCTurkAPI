package pro.btcturk.userDetail;



import io.cucumber.java.ro.Dar;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDetailResponseParameters {

        public Data data;
        public Support support;


        public class Data {
            public String id;
            public String email;
            public String first_name;
            public String last_name;
            public String avatar;
        }

        public class Support {
            public String url;
            public String text;
        }
    }


