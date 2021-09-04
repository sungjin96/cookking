package com.cookking.models.member;

import com.cookking.models.alarm.Alarm;
import com.cookking.models.search.Search;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;
import java.util.Set;

/**
 * Created by marathoner on 2021/08/23
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Member {
    @Id
    @GeneratedValue()
    @Column(updatable = false, nullable = false)
    private Long id;

    @Column(unique = true)
    private String email;

    @Column(unique = true)
    private String nickName;

    private LoginType loginType;

    private String token;

    @CreationTimestamp
    @Column(updatable = false)
    private Timestamp createdAt;

    @UpdateTimestamp
    private Timestamp updatedAt;

    private Timestamp deletedAt;

    @OneToMany(mappedBy = "sender")
    private List<Alarm> alarms;

    @OneToMany(mappedBy = "member")
    private List<Search> searches;

    @ManyToMany(mappedBy = "following")
    private List<Member> follow;

    @ManyToMany
    @JoinTable(
            name = "follow"
    )
    private List<Member> following;
}
