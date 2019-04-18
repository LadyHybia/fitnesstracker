package app.settings;

public class Results {
    long id;
    boolean is_temporary;
    boolean show_comments;
    boolean show_english_ingredients;
    boolean workout_reminder_active;
    long workout_reminder;
    String last_workout_notification;
    long workout_duration;
    boolean timer_active;
    long timer_pause;
    long age;
    long height;
    String gender;
    long sleep_hours;
    long work_hours;
    String work_intensity;
    long sport_hours;
    String sport_intensity;
    long freetime_hours;
    String freetime_intensity;
    long calories;
    String weight_unit;
    boolean ro_access;
    long num_days_weight_reminder;
    long user;
    String gym;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public boolean isIs_temporary() {
        return is_temporary;
    }

    public void setIs_temporary(boolean is_temporary) {
        this.is_temporary = is_temporary;
    }

    public boolean isShow_comments() {
        return show_comments;
    }

    public void setShow_comments(boolean show_comments) {
        this.show_comments = show_comments;
    }

    public boolean isShow_english_ingredients() {
        return show_english_ingredients;
    }

    public void setShow_english_ingredients(boolean show_english_ingredients) {
        this.show_english_ingredients = show_english_ingredients;
    }

    public boolean isWorkout_reminder_active() {
        return workout_reminder_active;
    }

    public void setWorkout_reminder_active(boolean workout_reminder_active) {
        this.workout_reminder_active = workout_reminder_active;
    }

    public long getWorkout_reminder() {
        return workout_reminder;
    }

    public void setWorkout_reminder(long workout_reminder) {
        this.workout_reminder = workout_reminder;
    }

    public long getWorkout_duration() {
        return workout_duration;
    }

    public void setWorkout_duration(long workout_duration) {
        this.workout_duration = workout_duration;
    }

    public String getLast_workout_notification() {
        return last_workout_notification;
    }

    public void setLast_workout_notification(String last_workout_notification) {
        this.last_workout_notification = last_workout_notification;
    }

    public boolean isTimer_active() {
        return timer_active;
    }

    public void setTimer_active(boolean timer_active) {
        this.timer_active = timer_active;
    }

    public long getTimer_pause() {
        return timer_pause;
    }

    public void setTimer_pause(long timer_pause) {
        this.timer_pause = timer_pause;
    }

    public long getAge() {
        return age;
    }

    public void setAge(long age) {
        this.age = age;
    }

    public long getHeight() {
        return height;
    }

    public void setHeight(long height) {
        this.height = height;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public long getSleep_hours() {
        return sleep_hours;
    }

    public void setSleep_hours(long sleep_hours) {
        this.sleep_hours = sleep_hours;
    }

    public long getWork_hours() {
        return work_hours;
    }

    public void setWork_hours(long work_hours) {
        this.work_hours = work_hours;
    }

    public String getWork_intensity() {
        return work_intensity;
    }

    public void setWork_intensity(String work_intensity) {
        this.work_intensity = work_intensity;
    }

    public long getSport_hours() {
        return sport_hours;
    }

    public void setSport_hours(long sport_hours) {
        this.sport_hours = sport_hours;
    }

    public String getSport_intensity() {
        return sport_intensity;
    }

    public void setSport_intensity(String sport_intensity) {
        this.sport_intensity = sport_intensity;
    }

    public long getFreetime_hours() {
        return freetime_hours;
    }

    public void setFreetime_hours(long freetime_hours) {
        this.freetime_hours = freetime_hours;
    }

    public String getFreetime_intensity() {
        return freetime_intensity;
    }

    public void setFreetime_intensity(String freetime_intensity) {
        this.freetime_intensity = freetime_intensity;
    }

    public long getCalories() {
        return calories;
    }

    public void setCalories(long calories) {
        this.calories = calories;
    }

    public String getWeight_unit() {
        return weight_unit;
    }

    public void setWeight_unit(String weight_unit) {
        this.weight_unit = weight_unit;
    }

    public boolean isRo_access() {
        return ro_access;
    }

    public void setRo_access(boolean ro_access) {
        this.ro_access = ro_access;
    }

    public long getNum_days_weight_reminder() {
        return num_days_weight_reminder;
    }

    public void setNum_days_weight_reminder(long num_days_weight_reminder) {
        this.num_days_weight_reminder = num_days_weight_reminder;
    }

    public long getUser() {
        return user;
    }

    public void setUser(long user) {
        this.user = user;
    }

    public String getGym() {
        return gym;
    }

    public void setGym(String gym) {
        this.gym = gym;
    }

    public long getNotification_languag() {
        return notification_languag;
    }

    public void setNotification_languag(long notification_languag) {
        this.notification_languag = notification_languag;
    }

    long notification_languag;

    @Override
    public String toString() {
        return "results[\n" +
                "{\n" +
                "id " + id +
                "\nis_temporary " + is_temporary +
                "\nshow_comments " + show_comments +
                "\nshow_english_ingredients " + show_english_ingredients +
                "\nworkout_reminder_active " + workout_reminder_active +
                "\nworkout_reminder " + workout_reminder +
                "\nlast_workout_notification " + last_workout_notification +
                "\nworkout_duration " + workout_duration +
                "\ntimer_active " + timer_active +
                "\ntimer_pause " + timer_pause +
                "\nage " + age +
                "\nheight " + height +
                "\ngender " + gender +
                "\nsleep_hours " + sleep_hours +
                "\nwork_hours " + work_hours +
                "\nwork_intensity " + work_intensity +
                "\nsport_hours " + sport_hours +
                "\nsport_intensity " + sport_intensity +
                "\nfreetime_hours " + freetime_hours +
                "\nfreetime_intensity " + freetime_intensity +
                "\ncalories " + calories +
                "\nweight_unit " + weight_unit +
                "\nro_access " + ro_access +
                "\nnum_days_weight_reminder " + num_days_weight_reminder +
                "\nuser " + user +
                "\ngym " + gym +
                "\n} ";
    }


}
