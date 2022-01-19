package com.java.labassesment1.q2;

public class Owner {
private String name, nic;
private Date dateOfBirth;
public Owner(String name, String nic,Date date) {
this.name = name;
this.nic = nic;
this.dateOfBirth =date;
}
@Override
public String toString() {
return "Owner \nname=" + name + ", nic=" + nic +dateOfBirth;
}

}