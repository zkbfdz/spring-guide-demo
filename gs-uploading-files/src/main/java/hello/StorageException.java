package hello;

/**
 * Created by kai.zhu on 2018/7/3/003.
 */
public class StorageException extends RuntimeException {

    public StorageException(String message){
        super(message);
    }

    public StorageException(String message, Throwable e) {
        super(message, e);
    }
}
