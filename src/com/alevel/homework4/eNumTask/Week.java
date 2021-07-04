package com.alevel.homework4.eNumTask;

public enum Week {
    SUNDAY ("Воскресенье", "выходной"),
    MONDAY ("Понедельник", "рабочий день"),
    TUESDAY ("Вторник", "рабочий день"),
    WEDNESDAY ("Среда", "рабочий день"),
    THURSDAY ("Четверг", "рабочий день"),
    FRIDAY ("Пятница", "рабочий день"),
    SATURDAY ("Суббота", "Java-день");

    String day;
    String typeOfDay;

    Week (String day){
        this.day = day;
    }
    Week (String day, String typeOfDay){
        this.day = day;
        this.typeOfDay = typeOfDay;
    }

    public String getDay() {
        return day;
    }

    public String getTypeOfDay() {
        return typeOfDay;
    }
}


