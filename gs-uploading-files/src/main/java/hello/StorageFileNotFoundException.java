package hello;

/**
 * Created by kai.zhu on 2018/7/3/003.
 */
public class StorageFileNotFoundException extends StorageException {

    public StorageFileNotFoundException(String message) {
        super(message);
    }

    public StorageFileNotFoundException(String message, Throwable e) {
        super(message, e);
    }
}
