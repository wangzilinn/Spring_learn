import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: wangzilinn@gmail.com
 * @Date: 1/26/2021 8:15 PM
 */
@Configuration
@EnableConfigurationProperties(UserProperties.class)
public class UserAutoConfiguration {

    @Bean
    @ConditionalOnProperty(prefix = "spring.user", value = "enabled")
    public UserClient userClient(UserProperties userProperties) {
        return new UserClient(userProperties);
    }
}
