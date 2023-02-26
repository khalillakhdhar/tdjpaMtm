package com.plateforme.entity.exemple;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "tutorials")
@Data
public class Tutorial {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;
private String title;
private String description;
private boolean published;

@ManyToMany(fetch = FetchType.LAZY,
cascade = {CascadeType.PERSIST,
		CascadeType.MERGE}
)

private Set<Tag> tags=new HashSet<>();

}

