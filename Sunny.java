import java.util.*;
import java.io.*;
public class Sunny{
  static class Course{
    String course;
    String courseid;
    public Course(String x, String y){
      course = x;
      courseid = y;
    }
  }
  public static void main(String[] args)throws IOException{
    Scanner sc = new Scanner(new File("sunny.dat"));
    ArrayList<Course> AllCourses = new ArrayList<Course>();
    
    while(sc.hasNextLine()){
      String courseid = sc.next();
      String course = sc.nextLine();
      Course entry = new Course(course,courseid);
      AllCourses.add(entry);
    }
    Collections.sort(AllCourses, new Comparator<Course>() {
    @Override
    public int compare(Course o1, Course o2) {
        return o1.course.compareTo(o2.course);
    }
});
    for(int i=0;i<AllCourses.size();i++){
      System.out.println(AllCourses.get(i).course+" ("+AllCourses.get(i).courseid+")");
    }
    }
  }