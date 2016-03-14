package models.constraint;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * Created by phasf on 14.03.2016.
 */
public class UsernameValidator implements ConstraintValidator<ValidUserName, String> {
    @Override
    public void initialize(ValidUserName validUserName) {

    }

    @Override
    public boolean isValid(String userName, ConstraintValidatorContext constraintValidatorContext) {
        if( userName == null)
            return false;

        boolean containsUpperCase = userName.matches(".*([A-Z]).*");
        boolean containsLowerCase = userName.matches(".*([a-z]).*");
        return (containsUpperCase && containsLowerCase );
    }
}
