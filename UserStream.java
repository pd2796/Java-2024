import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class User{

    String name,gender,email;
    int salary;

    public User(String name,String gender,String email,int salary)
    {
        this.name = name;
        this.gender = gender;
        this.email = email;
        this.salary = salary;
    }

    public String getGender(){
        return gender;
    }

    public int getSalary()
    {
        return salary;
    }
}


public class UserStream {
    
    public static void main(String[] args) {
        List<User> userList = Arrays.asList(new User("Alice","female","p@gmail.com",5000),
        new User("Clice","female","q@gmail.com",500),
        new User("Blice","other","r@gmail.com",1000),
        new User("Dlice","female","s@gmail.com",700));

        List<User> filterUser = userList.stream().filter(user -> !"other".equals(user.getGender())).collect(Collectors.toList());

        List<User> slarySort = userList.stream().sorted(Comparator.comparing(User::getSalary)).collect(Collectors.toList());
        
        slarySort.forEach(user->System.out.println("sal: " + user.name + "salary: " +user.salary));
        filterUser.forEach(user->System.out.println("Name: "+user.name +"  Gender: "+user.gender));
    }
}
