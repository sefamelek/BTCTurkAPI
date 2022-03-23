package pro.btcturk.ListUsers;

import lombok.Getter;
import lombok.Setter;
import java.util.List;

@Getter
@Setter
public class ListUsersResponseParameter {



        public int page;
        public int total;
        public int per_page;
        public int total_pages;

        public List<Data> data;
        public Support support;

        public class Data{
            public int id;
            public String email;
            public String first_name;
            public String last_name;
            public String avatar;
        }
    public class Support{
        public String url;
        public String text;
    }


    }

