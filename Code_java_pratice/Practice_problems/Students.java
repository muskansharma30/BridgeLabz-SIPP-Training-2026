package Practice_problems;

class Student{
    String name;
    int roll_Number;
    double marks;

    Student(String name,int roll_Number,double marks){
        this.name=name;
        this.roll_Number=roll_Number;
        this.marks=marks;
    }

    void displayDetails(){
        System.out.println("name: "+name+",Roll number:"+roll_Number+",marks"+marks);

    }

}

public class Students {

    public static void main(String[] args) {
        Student Student=new Student("akice",101,89.5);
        Student.displayDetails();

    }
}
