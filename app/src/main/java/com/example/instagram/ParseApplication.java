package com.example.instagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("QMMh7xYTzjnSJApD6jCancRF5ppGlSyhnd5tuBli")
                .clientKey("VvZj5BIRRETcRyQBnKH5t80Eez8ZubWLJUhDTZw3")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
