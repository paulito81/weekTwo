package models;

import com.sun.istack.internal.NotNull;
import models.constraint.ValidPassword;
import models.constraint.ValidUserName;

import javax.persistence.Entity;
import javax.validation.Valid;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

/**
 * Created by phasf on 14.03.2016.
 */
@Entity
public class User {

    @NotNull
    @ValidPassword
    @Pattern(regexp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^+&=])(?=\\S+$).{8,}$")
    private String password;

    @NotNull
    @Size(min = 5, max = 65)
    private String name;

    @NotNull
    @ValidUserName
    @Size(min = 5, max = 65)
    private String loginName;

    @NotNull
    @Pattern(regexp = "^[A-Za-z0-9+_.-]+@(.+)$")
    private String email;


}
