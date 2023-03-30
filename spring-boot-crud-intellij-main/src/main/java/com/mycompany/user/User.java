package com.mycompany.user;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, unique = true, length = 45)
    private String amount;

    @Column(length = 45, nullable = false, name = "note")
    private String note;

    @Column(length = 45, nullable = false, name = "description")
    private String description;

    private boolean paid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAmount() {return amount;}

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + getId() +
                ", amount='" + getAmount() + '\'' +
                ", note='" + getNote() + '\'' +
                ", description='" + getDescription() + '\'' +
                '}';
    }


    public boolean isPaid() {
        return paid;
    }

    public void setPaid(boolean paid) {
        this.paid = paid;
    }
}
