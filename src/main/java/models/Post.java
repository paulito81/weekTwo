package models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.crypto.Data;
import java.util.Date;

/**
 * Created by phasf on 14.03.2016.
 */
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    @Size(min = 4, max = 256)
    private String title;

    @NotNull
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateCreated;

    @NotNull
    @Size(max = 2048)
    private String content;



}
