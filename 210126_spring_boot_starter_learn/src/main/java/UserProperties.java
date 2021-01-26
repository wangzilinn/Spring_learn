import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @Author: wangzilinn@gmail.com
 * @Date: 1/26/2021 5:45 PM
 */
@Data
@ConfigurationProperties("spring.user")
public class UserProperties {
    private String name;
}
