package racingcar;


import org.junit.platform.commons.util.StringUtils;

public class CarName {
    private static final int MAX_NAME_LENGTH = 5;
    private String name;

    private void validateName(String name) throws IllegalArgumentException {
        // 사용해도 되나?? static import
        if (StringUtils.isBlank(name)) {
            throw new IllegalArgumentException(ErrorMessage.CAR_NAME_IS_BLANK);
        }
        if (name.length() > MAX_NAME_LENGTH) {
            throw new IllegalArgumentException(ErrorMessage.CAR_NAME_IS_TOO_LONG);
        }
    }

    public CarName(String name) throws IllegalArgumentException {
        validateName(name);
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
