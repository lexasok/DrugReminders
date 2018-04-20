package net.ozero.drugreminders.DataStructures;

class Time {
    private int hour;
    private int min;

    public Time(int hour, int min) {
        if (hour >= 0 && hour < 24) {
            this.hour = hour;
        } else if (hour >= 24) {
            this.hour = 23;
        } else {
            this.hour = 0;
        }

        if (min >= 0 && min < 60) {
            this.min = min;
        } else if (min >= 60) {
            this.min = 59;
        } else {
            this.min = 0;
        }
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if (hour >= 0 && hour < 24) {
            this.hour = hour;
        } else if (hour >= 24) {
            this.hour = 23;
        } else {
            this.hour = 0;
        }
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        if (min >= 0 && min < 60) {
            this.min = min;
        } else if (min >= 60) {
            this.min = 59;
        } else {
            this.min = 0;
        }
    }
}
