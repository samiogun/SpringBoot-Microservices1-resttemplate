package org.ersun.customer;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Customer {

    @Id
    @SequenceGenerator(
            name = "customer_id_sequence_generator",
            sequenceName = "customer_id_sequence"
    )
    @GeneratedValue(
            generator = "customer_id_sequence_generator",
            strategy = GenerationType.SEQUENCE
    )
    private int id;
    private String firstName;
    private String lastName;
    private String email;

}
