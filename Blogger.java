package fi.company;

import javax.persistence.*;

@Entity
public class Blogger {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(length = 10000)
    private String subject;
    @Column(length = 256)
    private String headline;
    private String name;

    public Blogger() {
    }

    public Blogger(long id, String name, String headline, String subject) {
        this.id = id;
        this.name = name;
        this.headline = headline;
        this.subject = subject;

    }
    /* public Customer(int id, String name) {
         this.id = id;
         this.name = name;
     }*/
    public String getHeadline() {
        return headline;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

}

