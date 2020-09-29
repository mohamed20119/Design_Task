package com.example.task1;

public class ListviewModel {
   private String title , time , gender , type , counter ;
   private int pic;
    public ListviewModel(String title, String time, String gender, String type, String counter,int pic) {
        this.title = title;
        this.time = time;
        this.gender = gender;
        this.type = type;
        this.counter = counter;
        this.pic = pic;
    }

    public int getPic() {
        return pic;
    }

    public void setPic(int pic) {
        this.pic = pic;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCounter() {
        return counter;
    }

    public void setCounter(String counter) {
        this.counter = counter;
    }
}
