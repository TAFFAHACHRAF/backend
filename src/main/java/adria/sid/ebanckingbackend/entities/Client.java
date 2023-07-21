package adria.sid.ebanckingbackend.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class Client extends Personne{
    private String operateur;
    private String address;
    private Long tel;
    private String CIN;
    private String email;

    @OneToMany(mappedBy = "client", cascade = CascadeType.ALL)
    private List<Virement> virements;

    @OneToMany(mappedBy = "client", cascade = CascadeType.ALL)
    private List<Message> messages;

}
