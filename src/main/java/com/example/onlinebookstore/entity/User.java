package com.example.onlinebookstore.entity;

import com.example.onlinebookstore.helper.Category;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "user_details")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int userid;

        @Column(unique = true)
        private String email;

        private String password;

        private String first_name;

        private String last_name;

        @Lob
        private byte[] profile;

        @Enumerated(EnumType.ORDINAL)
        private Category category;

        private boolean isDeregister;

        private LocalDateTime deRegisterTime;

        private boolean isUserBlock;

}

