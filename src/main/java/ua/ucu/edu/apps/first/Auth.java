package ua.ucu.edu.apps.first;

public class Auth {
    public MyUser login() {
        return new MyTwitterUser(new TwitterUser());
        // return new MyFacebookUser(new FacebookUser());
    }
}
