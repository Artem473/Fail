package ru.sapteh;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Person {
        private int id;
        private String lastName;
        private String firstName;
        private String price;
        private Date date;

        public Person(int id, String lastName, String firstName, String price, Date date ){
            this.id = id;
            this.lastName= lastName;
            this.firstName = firstName;
            this.price = price;
            this.date = date;
        }

        public int getId() {
            return id;
        }
        public String getLastName() {

            return lastName;
        }

        public String getFirstName() {
            return firstName;
        }
        public String getPrice() {
            return price;
        }
        public Date getDate() {
            return date;
        }


        private String dateToString() throws ParseException {
            return new SimpleDateFormat("dd.MM.yyyy").format(getDate());
        }
        public String toString() {
            try {
                return String.format("%d, %s, %s, %s, %s",getId()  ,getLastName() ,getFirstName() ,getPrice(),dateToString() );
            }catch (ParseException e){
                e.printStackTrace();
            }
            return null;

        }
}
