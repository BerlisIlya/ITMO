package Lessons.LaboratoryWork3;

class Study {

    private String course;

    public Study(String name) {
        this.course = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String printCourse() {
        return this.course;
    }
}

class JavaProgram {
    public static void main(String[] args) {
        Study study = new Study("Learning Java is very easy");
        System.out.println(study.printCourse());

        study.setCourse("And I like it");

        System.out.println(study.printCourse());
    }
}
