package com.example;

public class User {

    private String name;
    private int age;
    private String address;
    private String nrc;

    private User(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.address = builder.address;
        this.nrc = builder.nrc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNrc() {
        return nrc;
    }

    public void setNrc(String nrc) {
        this.nrc = nrc;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", nrc='" + nrc + '\'' +
                '}';
    }

    static class Builder {

        private String name;
        private int age;
        private String address;
        private String nrc;

        public Builder(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public Builder addAddress(String address) {
            this.address = address;
            return this;
        }

        public Builder addNRC(String nrc) {
            this.nrc = nrc;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }

}

class Program {
    public static void main(String[] args) {
        User kaungmaw = new User.Builder("Kaung Maw Aung", 24).addAddress("Tamwe").addNRC("123455").build();

        System.out.println(kaungmaw.toString());

    }
}
