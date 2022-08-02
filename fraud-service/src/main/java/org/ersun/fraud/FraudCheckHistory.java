package org.ersun.fraud;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class FraudCheckHistory {

    @Id
    @SequenceGenerator(
            name = "fraud_id_sequence_generator",
            sequenceName = "fraud_id_sequence"
    )
    @GeneratedValue(
            generator = "fraud_id_sequence_generator",
            strategy = GenerationType.SEQUENCE
    )
    private Integer id;
    private Integer customerId;
    private Boolean isFraudster;
    private LocalDateTime createdAt;

}
