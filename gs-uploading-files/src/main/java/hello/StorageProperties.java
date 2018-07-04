package hello;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by kai.zhu on 2018/7/3/003.
 */
@ConfigurationProperties("storage")
@Data
public class StorageProperties {

    private String location="upload-dir";
}
