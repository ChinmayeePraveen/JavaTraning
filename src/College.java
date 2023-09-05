class College{
    private String principal;
    public void getPrincipal(){
        this.principal = principal;
    }

    public void teaching(){
        System.out.println(("Principal name is "+principal+ "&the teacher name is"));
    }
}
class  Classroom extends  College{
   public String Teacher;
   public void setTeacher(String Teacher){
       this.Teacher = Teacher;
   }

    public void teaching(){
       // System.out.println(("Principal name is "+getPrincipal()  "&the teacher name is"));
    }
}