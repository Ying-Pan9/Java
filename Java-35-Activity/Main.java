class Main {
  public static void main(String[] args)throws Exception {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init()throws Exception{

    CreateList list = new CreateList("CR101.csv");
    Student[] students = list.getStudentArray();

    // Use the array of students called "students" and the functions from the 'Student' class of the prior lesson to answer the questions listed below:  
    
    // 1: How many students are passing and how many are failing?
    for(int x=0; x< students.length; x++){
      Student student = students[x];
      if(student.gpa<65){
        fail++;
      }
      else{
        pass++;
      }
    }
    print("\nStudents passing:  " + pass);
    print("Students failing:  " + fail);

    // 2: What percentage of students are failing?
    print("\nPercentage failing: " + fail/(double)students.length*100 + " %");

    // 3: How many failing students have "Castro R" as their teacher?
    for(int x=0; x< students.length; x++){
      Student student = students[x];
      if(student.findTeacher("CASTRO R") && student.gpa<65){
        count++;
      }
    }

    print("\nNumber of Castro R's students failing: " + count);

    // 4: How many failing students are not taking a Music course? (Note: Music courses start with "UL")
    count=0;
    for(int x=0; x< students.length; x++){
      Student student = students[x];
      if(!student.findCourseStartingWith("UL") && student.gpa<65){
        count++;
      }
    }
    print("\nNumber of failing students not taking Music: "+count);

    // 5: Display the IDs of all students taking music, but failing it (music courses start with "UL").
    count=0;
    for(int x=0; x< students.length; x++){
      Student student = students[x];
      if(!student.findCourseStartingWith("UL") && student.gpa<65){
        count++;
      }
    }
    print("\nNumber of failing students not taking Music: "+count);
    // 6: How many freshmen and sophomores have a GPA over 90?
    count=0;
    for(int x=0; x < students.length; x++){
      Student student = students[x];
      if( (student.gradeLevel == 9 ||
         student.gradeLevel == 10 )&&
         student.gpa > 97 ){
        count++;
      }
    }

    print("\nNumber of freshmen and sophomores with GPA over 97: "+count);
    // 7: How many students have both of the following teachers: Banu and Porchetta?
    count=0;
    for(int x=0; x< students.length; x++){
      Student student = students[x];
      if(student.findTeacher("PROCHETTA")  &&
        student.findTeacher("BANU")){
        count++;
      }
    }
    print("\nNumber of students with both Banu & Porchetta as teachers: "+count);
    // 8: How many freshmen, sophomores, juniors and seniors are there?
    int fresh = 0,soph = 0, junior = 0, senior = 0;
    for(int x = 0; x < students.length; x++){
      Student student = students[x];
      if(student.gradeLevel == 9){
        fresh++;
      }
      else if(student.gradeLevel == 10){
        soph++;
      }
      else if(student.gradeLevel == 11){
        junior++;
      }
      else if(student.gradeLevel == 12){
        senior++;
      }
    }
    print("\nTotal Freshmen:  " + fresh);
    print("Total Sophmores:  " + soph);
    print("Total Juniors:  " + junior);
    print("Total Seniors:  " + senior);

    // 9: For teacher Porchetta's students, display the number of students by grade level.
    fresh = 0; soph = 0; junior = 0; senior = 0;
    for(int x = 0; x< students.length; x++){
      Student student = students[x];
      if(student.findTeacher("PORCHETTA")){
        if(student.gradeLevel == 9){
         fresh++;
        }
        else if(student.gradeLevel == 10){
          soph++;
        }
        else if(student.gradeLevel == 11){
          junior++;
        }
        else if(student.gradeLevel == 12){
          senior++;
        }
      }
    }
    print("\nPorchetta's students by grade level:");
    print("Porchetta's freshmen:  " + fresh);
    print("Porchetta's sophmores:  " + soph);
    print("Porchetta's juniors:  " + junior);
    print("Porchetta's seniors:  " + senior);    
  } 
}







  
  int randInt(int lower, int upper){
    int range = upper - lower + 1;
    return (int)(Math.random()*range) + lower;
  }

}