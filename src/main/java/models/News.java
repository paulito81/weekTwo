package models;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Created by phasf on 14.03.2016.
 */
public class News {

    @NotNull
    @Size(min = 4, max = 2000)
    private String userComment;



}
