package pro.btcturk.config;

public class Var {

    public static String URL = XmlFileParse.xmlFileParse("URL", "src/main/java/pro/btcturk/resources/Variables.xml");
    public static final String USERS_POST_PATH="/api/users";
    public static final String USERS_PATH="/api/users/";
    public static final String USERS_LIST_PATH="/api/users?page=";

}
