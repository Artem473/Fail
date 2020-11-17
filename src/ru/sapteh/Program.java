package ru.sapteh;


import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Program {
    public static void main(String[] args) throws IOException, ParseException {
        String fileName = "listStudents.txt";
        ArrayList<Person> arrayList = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))){
            while (reader.ready()){
                Person person = getPerson(reader.readLine());
                arrayList.add(person);

            }
        }
        File file = new File("C:/Java_42/Bizon.txt");
        file.createNewFile();
        FileWriter fw = new FileWriter(file);
        for (Person person : arrayList) {
            fw.write(person.toString());
            fw.write("\n");
        }
        fw.close();
    }
    public static Person getPerson(String str) throws ParseException {
        String[] strings = str.split(" ");
        int id = Integer.parseInt(strings[0]);
        String lastName = strings[1];
        String firstName = strings[2];
        String patronymic = strings [3];
        Date date = new SimpleDateFormat("MM/dd/yyyy").parse(strings[4]);
        return new Person(id,lastName,firstName,patronymic,date);
    }
}
