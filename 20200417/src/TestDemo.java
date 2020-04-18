import java.util.Arrays;
/**
 * @program: 20200417
 * @description
 * @author: mrs.yang
 * @create: 2020 -04 -17 15 :58
 */

/**
 *
 */

public class singleLinkedList{
    public void addFirst(int data);
    public void addLast(int data);
    public boolean addIndex(int index, int data);
    public boolean contains(int key);
    public void remove(int key);
    public void removeAllkey(int key);
    public int size();
    public void display();
    public void clear();

}
public class TestDemo {
    public static void main(String[] args) {

    }
    /*public static void main(String[] args) {//给定两个整型数组, 交换两个数组的内容
        int[] arr1={1,2,3,4,5};
        int[] arr2={6,7,8,9,10};
        swap(arr1,arr2);
        System.out.print(Arrays.toString(arr1));
        System.out.println();
        System.out.print(Arrays.toString(arr2));
    }
    public static void swap(int[] arr1,int[] arr2){
        int tmp=0;
        for (int i = 0; i <arr1.length ; i++) {
            tmp=arr1[i];
            arr1[i]=arr2[i];
            arr2[i]=tmp;
        }

    }*/
    /*public static void main(String[] args) {//给定整型数组, 把所有的偶数放到数组前面, 把所有奇数放到数组后面.
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        func(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void func(int[] arr) {
        int left=0;
        int right=arr.length-1;
        while(left<right){
            while((arr[left]%2==0) && (left<right)){
                left++;
            }
            while((arr[right]%2==1)&&(left<right)){
                right--;
            }
            if(left<right){
                int tmp=arr[left];
                arr[left]=arr[right];
                arr[right]=tmp;
            }
        }
    }*/
}

/*class Person{
    private String name;
    private int age;
    private static int count;
    public Person(){//构造方法
        this("zhangsan",18);//只能在构造方法中使用
    }

    public void func(){
        System.out.println(this.getName());
        System.out.println(this.age);

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

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Person(String name, int age) {//构造方法 可以重载
        this.name = name;
        this.age = age;
    }
    {//实例代码块
        this.name="lisi";
        System.out.println("====");
    }
    static {//静态代码块
        count=10;
    }
}
    public class Test{
        static int cnt = 6;
        static{
            cnt += 9;
        }


        public class TestDemo{
            public static void main(String[] args) {
                Person per=new Person();
            }
        }*/
/*class Student{
    private String name;
    private String age;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
    //提供一个公开的接口

    *//*public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name=name;
    }*//*
    public void show(){
        System.out.println("我叫"+this.name+" "+ "今年"+this.age+"岁");
    }

}*/
/*public class TestDemo{
    public static void main(String[] args) {
        int[] arr={1,2,3,4,6,1,2,4};
        int ret =0;
        for (int i = 0; i <arr.length ; i++) {
            ret=ret^arr[i];
        }
        int inDexOf1=0;
        while(((ret&1)==0)&&(inDexOf1<=arr.length)){
            ret=ret>>1;
            inDexOf1++;
        }
        int num1=0;
        int num2=0;
        for (int i = 0; i <arr.length ; i++) {
            if(((arr[i]>>inDexOf1)&1)==1){
                num1=num1^arr[i];
            }else{
                num2=num2^arr[i];
            }
        }
        System.out.println(num1);
        System.out.println(num2);

    }
    public static void main(String[] args) {
        Student stu = new Student();
        *//*String str= stu.getName();
        stu.setName("张三");*//*
        String str=stu.getName();
        stu.setName("张三");
        stu.show();
    }
}
class Person {
   public String name="张三";
   public int age=18;
   public static int size = 10;
   public void eat(){//方法/行为
       System.out.println("eat()");
   }
   public static void func(){
       System.out.println("func");
   }
   public void show(){
       System.out.println("我叫"+name+" "+ "今年"+age+"岁");
   }

}
public class TestDemo {
    public static void main(String[] args) {
        Person per=new Person();
        per.eat();//访问实例成员方法
        Person.func();
        per.name="李四";
        per.age=18;
        per.show();
        //System.out.println(per.name);//访问成员变量
        //System.out.println(per.age);
       // System.out.println(Person.size);
    }
}*/
