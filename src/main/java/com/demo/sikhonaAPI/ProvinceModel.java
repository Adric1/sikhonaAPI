package com.demo.sikhonaAPI;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "provinces", schema = "provincesdb")
public class ProvinceModel {
    @Id
    private String value;
    @JsonProperty("display-name")
    @Column(name="display-name")
    private String displayName;

    @Override
    public String toString(){
        return "value='" + value + '\'' + ", display-name='" + displayName + '\'' + '}';
    }
}
