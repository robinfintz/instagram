package com.example.instagram;

import com.parse.ParseClassName;
import com.parse.ParseFile;
import com.parse.ParseObject;
import com.parse.ParseUser;

@ParseClassName("Post")
public class Post extends ParseObject {

    public static final String KEY_DESCRIPTION="description";
    public static final String KEY_IMAGE="image";
    public static final String KEY_USER="user";

    public String getDescription(){
        return getString(KEY_DESCRIPTION);
    }

    public void setDescription(String d){
        put(KEY_DESCRIPTION, d);
    }

    public ParseFile getImage(){
        return getParseFile(KEY_IMAGE);
    }

    public void setImage(ParseFile p){
        put(KEY_IMAGE, p);
    }

    public ParseUser getUser(){
        return getParseUser(KEY_USER);
    }

    public void setUser(ParseUser u){
        put(KEY_USER, u);
    }



}
