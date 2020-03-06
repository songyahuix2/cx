#### 1. 实现以下字符串练习

```java
// 1."fileviewgoodrunbuildfilehelp"  字符串逆转
// 2."fileviewgoodrunbuildfilehelp" 截取 子字符串 "goodrunbuild"
// 3."fileviewgoodrunbuildfilehelp" 截取 最后五个字母

  
/*字符串加密解密
           Welcome
    加密方法：
      将第一个字母调换到最后，然后每个字母加3 
 （1）实现加密，并测试
 （2）给定某一加密后的字符串，并解密还原成初始字符串
*/
```

#### 2. 描述 int 与 Integer 的区别（常见面试题）

int 是基本类型，Integer是包装类，但是两中类型可以相互转化

#### 3.  Java中的泛型是什么 ? 使用泛型的好处是什么?（常见面试题）

泛型是在调用类型的静态成员或者创建对象后调用内部成员时可以实时定义参数列表的类型；Java泛型具有编译时检查功能，提高数据安全性

#### 4.什么是装箱拆箱？（常见面试题）

拆箱：包装类转化成基本数据类型

int i1 = new Integer(i2).intValue();

int i1 = Integer.valuesOf("i2");

...

装箱：基本数据类型转化为包装类

Integer integer = 12;

Double double = 12;

...

#### 5. 将字符串 "45.6" 转换成数值

float f = Float.valueOf("45.6");

float f = Float.parseFloat("45.6");

#### 6.  按照如下格式 yyyy-MM-dd 输入一个字符串日期，检查它是否是闰年，如果是返回true，否则返回false



#### 7. 阅读程序题，写结果

```java
  public class TestResource{
      
      public static String output = "";
      public static void foo(int i){
          try{
              if(i ==1){
                  throw new Exception();                  
              }
              output +="1";
          }catch(Exception e){
              output += "2";
              return;
          }finally{
          	 output += "3";
		  }
          	output += "4";
      }
      
      public static void main(String[] args){
                  //  foo(0);
                 foo(1);          
      }      
      //程序执行后，变量"output"的值是多少      
  }

//foo(0)时，output="134"
//foo(1)时，output = "23"
```

8. 
9. ![](img\1.png)



10 . ![](img\2.jpg)