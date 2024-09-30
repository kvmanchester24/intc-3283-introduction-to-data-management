package edu.northwestu.intc3283.datasourcestarter.entity;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;
import org.springframework.validation.annotation.Validated;
import java.time.Instant;

@Table("entries")
@Validated
public class Entry {

    @Id
    private Long id;

    @Size(min = 5, max=50)
    @NotEmpty
    private String name;

    @Email
    @NotEmpty
    private String email;

    @Column ("phone")
    @Size (max=15)
    private String phone;

    @Column ("vacation_spot")
    private String vacation_spot;

    @Column ("transportation")
    private String Transportation;

    @Column ("emergency_contact")
    private String emergency_contact;

    @Column ("ec_phone")
    @Size (max=15)
    private String ec_phone;

    @CreatedDate
    private Instant createdAt;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getVacation_spot() {
        return vacation_spot;
    }

    public void setVacation_spot(String vacation_spot) {
        this.vacation_spot = vacation_spot;
    }

    public String getTransportation() {
        return Transportation;
    }

    public void setTransportation(String transportation) {
        Transportation = transportation;
    }

    public String getEmergency_contact() {
        return emergency_contact;
    }

    public void setEmergency_contact(String emergency_contact) {
        this.emergency_contact = emergency_contact;
    }

    public String getEc_phone() {
        return ec_phone;
    }

    public void setEc_phone(String ec_phone) {
        this.ec_phone = ec_phone;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Instant createdAt) {
        this.createdAt = createdAt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
