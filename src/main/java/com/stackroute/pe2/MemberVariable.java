//class named Member Variable that creates an instance of the Member class, initialises its
//member variables, and then displays the value of each member variable.

package com.stackroute.pe2;

public class MemberVariable {

    Member obj = new Member();


    public void initializeData(String nameValue, int ageValue, double salaryValue) {

        obj.name = nameValue;
        obj.age = ageValue;
        obj.salary = salaryValue;

    }

    public String displayData() {

        return ("Members Name: "+obj.name + " Members age: "+obj.age+" Members salary: "+obj.salary);


    }


}