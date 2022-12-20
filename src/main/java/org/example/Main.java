//  Имеются данные о группе студентов. У каждого студента есть средний балл (например, 4.6).
//  Создайте родительский класс ЗаписывательВФайл. Создайте три детских класса, которые записывают в файл информацию о студентах в разных формах

package org.example;

public class Main {
    public static void main(String[] args) {

        String textTxt = "Иван Иванов=4.8\n" +
                "Мария Кузнецова=5.0\n" +
                "Степан Кузьмин=3.6";
        new SetTxt().setFile(textTxt);

        String textJson = "{\n" +
                "\"Иван Иванов\": 4.8,\n" +
                "\"Мария Кузнецова\": 5.0,\n" +
                "\"Степан Кузьмин\": 3.6\n" +
                "}";
        new SetJson().setFile(textJson);

        String textXml = "<?xml version=\"1.0\" encoding=\"utf-8\" ?>\n" +
                "<students>\n" +
                "<student>\n" +
                "<name>Иван Иванов</name>\n" +
                "<grade>4.8</grade>";
        new SetXml().setFile(textXml);
    }


}