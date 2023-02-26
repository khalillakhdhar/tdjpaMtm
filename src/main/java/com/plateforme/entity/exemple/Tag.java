package com.plateforme.entity.exemple;

import java.util.HashSet;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonIgnore;

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
@Table(name = "tags")
@Data
public class Tag {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;
private String name;
@ManyToMany(fetch = FetchType.LAZY,
cascade = {
		CascadeType.MERGE,CascadeType.PERSIST
},mappedBy = "tags"
)
private Set<Tutorial> tutorials=new HashSet<>();

}