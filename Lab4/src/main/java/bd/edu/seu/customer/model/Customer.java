package bd.edu.seu.customer.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.time.LocalDate;
import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Customer {
    @Id
    private long id;
    private String name;
    private LocalDate DateOfBirth;
@OneToMany
    private List<CustomerPhoneNumber> customerPhoneNumberList;
}
