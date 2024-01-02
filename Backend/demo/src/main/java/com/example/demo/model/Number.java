package com.example.demo.model;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;


@Entity
    @Getter
    @Setter

    public class Number {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Column(name="Mobile")
        private String mob;
        private String addressLine1;
        private String addressLine2;
        private String landmark;
        private String city;
        private String state;
        private String pincode;

        public Number() {
        }

        @Override
        public String toString() {
            return "Number{" +
                    "id=" + id +
                    ", mob='" + mob + '\'' +
                    ", addressLine1='" + addressLine1 + '\'' +
                    ", addressLine2='" + addressLine2 + '\'' +
                    ", landmark='" + landmark + '\'' +
                    ", city='" + city + '\'' +
                    ", state='" + state + '\'' +
                    ", pincode='" + pincode + '\'' +
                    '}';
        }
    }


