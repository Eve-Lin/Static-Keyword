public class Students {

    String name;
    int age;

    static int counter;


    Students(){

        counter++;
    }


    public String getName(){

        return name;
    }

    public void setName(String name){

        this.name = name;
    }

    public int getAge(){

        return age;
    }


    public void setAge(Integer age){
        this.age = age;
    }
}
