package Deposits;

import Customer.Customer;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import javax.persistence.*;
import java.util.Set;

string depositsType{}

@Entity
public class Deposits {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String transaction_date;

    private String status;

    private Long payee_id;

    private String medium;

    private double amount = 0.0;

    private String description;

    @ManyToOne
    @JsonBackReference
    private Customer customer;

    public Long getId(){
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getTransaction_date(){
        return transaction_date
    }
}
