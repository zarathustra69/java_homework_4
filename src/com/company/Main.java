package com.company;

public class Main {

    public static void main(String[] args) {
        Person[] persArray = new Person[5];
        persArray[0] = new Person("Ivanov Ivan",
                "Engineer",
                "ivivan@mailbox.com",
                "892312312",
                30000,
                30,
                true);
        persArray[1] = new Person("Petrov Petr",
                "Engineer",
                "pepetr@mailbox.com",
                "892341234",
                30000,
                31,
                false);
        persArray[2] = new Person("Semenov Semen",
                "Safety Manager",
                "sesemen@mailbox.com",
                "892345123",
                40000,
                34,
                true);
        persArray[3] = new Person("Fyodorov Fyodor",
                "Designer",
                "fyfyodor@mailbox.com",
                "892345612",
                35000,
                29,
                false);
        persArray[4] = new Person("Vasilev Vasily",
                "Supervisor",
                "vavasily@mailbox.com",
                "892345671",
                35000,
                37,
                true);
        for(int i = 0; i< persArray.length; i++){
            if(persArray[i].vaccinated == true) {
                persArray[i].info();
            }
        }
    }
}
