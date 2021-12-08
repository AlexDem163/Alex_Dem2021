package lesson10;

public enum CourseEnum {
    USDD(75.28), EURR(83.43), CNYY(11.59);

    private double index;

    CourseEnum (double index) {
        this.index = index;
    }

    public static CourseEnum as(double index) {
        for (CourseEnum course : values()){
            if (course.index == index) {
                return course;
            }
        }
        return CourseEnum.USDD;
    }

    public String toString() {
        return name();
    }
}
