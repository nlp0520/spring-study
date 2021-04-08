package com.mashibing2.bean;

/**
 * @Auther:niulipeng
 * @Date:2021/4/8
 * @Description:com.mashibing.bean
 * @Version:1.0
 */
public class Person {
    private String name;
    private int age;
    private String geneader;

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

    public String getGeneader() {
        return geneader;
    }

    public void setGeneader(String geneader) {
        this.geneader = geneader;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", geneader='" + geneader + '\'' +
                '}';
    }
}
