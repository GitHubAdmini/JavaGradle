class Person {
    private String name;
    private String gender;
    private int age;
    private String[] Interests;
    Person(String name, String gender, int age, String [] interests){
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.Interests = interests;
    }
    public String Hello(){
        return "Hello, my name is "+this.name+" and i am "+this.age+" years old. My interests are "
                +this.Interests[0]+this.Interests[1]+" "+this.Interests[2]+" and "+this.Interests[3];
    }
    public static void main(String[] args){
        Person musa = new Person("Musa","Male",27,new String[] {"enterprise architect ","Oss/Bss","project management","automation"});
        String greeting =  musa.Hello();
        System.out.println(greeting);
    }
}
