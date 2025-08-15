package com.example.sea_port_simulation.Nasir_2211444;

public class Message {
    private String Subject;
    private String Content;

    public Message(String subject, String content) {
        Subject = subject;
        Content = content;
    }

    public String getSubject() {
        return Subject;
    }

    public void setSubject(String subject) {
        Subject = subject;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }

    @Override
    public String toString() {
        return "Message{" +
                "Subject='" + Subject + '\'' +
                ", Content='" + Content + '\'' +
                '}';
    }
}
