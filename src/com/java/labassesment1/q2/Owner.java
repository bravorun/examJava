package com.java.labassesment1.q2;

public class Owner {
private String name, nic;
private Date date_of_birth;
public Owner(String name, String nic,Date date) {
this.name = name;
this.nic = nic;
this.date_of_birth =date;
}
@Override
public String toString() {
return "Owner [name=" + name + ", nic=" + nic + "]";
}

}