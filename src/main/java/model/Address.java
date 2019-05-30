package model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "addres")

public class Address {

    int postCode1stPart;
    int postCode2ndPart;

public String CreatePosdCode () {
    return postCode1stPart + "-" + postCode2ndPart;
}
}
