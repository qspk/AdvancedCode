package exception;

/**
 * 1.自定义异常类
 * 2.继承自(运行) 异常类
 * 3.提供空参 /带参构造
 * 年龄数值超过界限
 */


public class AgeOutOfBoundsException extends RuntimeException {
    public AgeOutOfBoundsException() {

    }

    public AgeOutOfBoundsException(String message) {
        super(message);
    }
}
