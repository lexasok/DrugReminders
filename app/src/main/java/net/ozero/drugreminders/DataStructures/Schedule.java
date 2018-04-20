package net.ozero.drugreminders.DataStructures;

import java.util.Date;

class Schedule {

    private Date start;
    private Date end;
    private DayFrequency frequency;

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }

    public DayFrequency getFrequency() {
        return frequency;
    }

    public void setFrequency(DayFrequency frequency) {
        this.frequency = frequency;
    }
}
