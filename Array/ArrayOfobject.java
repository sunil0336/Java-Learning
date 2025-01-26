class student{
    int rollno;
    String name;
    int marks;
}


public class ArrayOfobject {
    public static void main(String[] args) {
        
        student s1 = new student();
        s1.rollno = 1;
        s1.name = "Sunil";
        s1.marks = 70;

        student s2 = new student();
        s2.rollno = 2;
        s2.name = "Rathod";
        s2.marks = 80;

        student s3 = new student();
        s3.rollno = 3;
        s3.name = "Syan";
        s3.marks = 90;

        student stud[] = new student[3];

        stud[0] = s1;
        stud[1] = s2;
        stud[2] = s3;

        System.out.println("Roll No.: Name : Marks");
        for(int i=0;i< stud.length;i++){
            System.out.println(stud[i].marks +" : "+stud[i].name +" : "+ stud[i].marks);
        }

    }
}
