import java.util.LinkedList;
import java.util.List;

public class User {
    private String name;
    private int age;
    private List<String> interests;
    private List<User> friends;

    public User(String name, int age, List<String> interests) {
        this.name = name;
        this.age = age;
        this.interests = interests;
        this.friends = new LinkedList<>();
    }

    public void addFriend(User friend) {
        friends.add(friend);
    }

    public List<User> getFriends() {
        return friends;
    }

    public String getName() {
        return name;
    }
    public List<String> getInterests() {
        return interests;
    }
    @Override
    public String toString() {
        return name;
    }
}