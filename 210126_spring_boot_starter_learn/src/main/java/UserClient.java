/**
 * @Author: wangzilinn@gmail.com
 * @Date: 1/26/2021 8:19 PM
 */
public class UserClient {
    private UserProperties userProperties;
    public UserClient() {

    }

    public UserClient(UserProperties userProperties) {
        this.userProperties = userProperties;
    }

    public String getName() {
        return userProperties.getName();
    }
}
