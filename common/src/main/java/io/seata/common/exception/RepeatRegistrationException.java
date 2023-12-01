package io.seata.common.exception;

/**
 * The repeat registration exception.
 *
 * @author yiqi
 */
public class RepeatRegistrationException extends RuntimeException {
    /**
     * Instantiates a new RepeatRegistrationException.
     *
     * @param message the message
     */
    public RepeatRegistrationException(String message) {
        super(message);
    }

    /**
     * Instantiates a new RepeatRegistrationException.
     *
     * @param message the message
     * @param cause   the cause
     */
    public RepeatRegistrationException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * Instantiates a new RepeatRegistrationException.
     *
     * @param cause the cause
     */
    public RepeatRegistrationException(Throwable cause) {
        super(cause);
    }
}
