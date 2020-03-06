package other.design_pattern.prototype;

import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

/**
 * @author shkstart
 * @date 2019/10/26 - 9:08
 * 适用环境：
 * 高效复制创建成本比较大（比如初始化需要较长时间、占用太多CPU、占用大量网络资源等）的数据
 */
class Mail implements Cloneable{
    private String receiver;
    private String subject;
    private String content;
    private String tail;
    private ArrayList<String> arrayList;
    private String test = new String("引用创建");
    public Mail(EventTemplate et){
        this.tail = et.getEventContent();
        this.subject = et.getEventSubject();
    }
    public Mail clone(){
        Mail mail = null;
        try{
//
            mail = (Mail) super.clone();
            mail.arrayList = (ArrayList<String>)this.arrayList.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return mail;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTail() {
        return tail;
    }

    public void setTail(String tail) {
        this.tail = tail;
    }
}
class EventTemplate{
    public EventTemplate(String eventSubject, String eventContent) {
        this.eventSubject = eventSubject;
        this.eventContent = eventContent;
    }

    public String getEventSubject() {
        return eventSubject;
    }

    public void setEventSubject(String eventSubject) {
        this.eventSubject = eventSubject;
    }

    public String getEventContent() {
        return eventContent;
    }

    public void setEventContent(String eventContent) {
        this.eventContent = eventContent;
    }

    private String eventSubject,eventContent;
}

//ConcretePrototype（具体原型类）：它实现抽象类中声明的克隆方法，返回一个自己的克隆对象



public class Prototype_Pattern {

    public static String getRandString(int maxLength) {
        String source = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuffer sb = new StringBuffer();
        Random rand = new Random();
        for(int i = 0;i<maxLength;i++){
            sb.append(source.charAt(rand.nextInt(source.length())));
        }
        return sb.toString();
    }

    public static void sendMail(Mail mail){
        System.out.println("标题:"+mail.getSubject()+"\t收件人:"
                +mail.getReceiver()+"\t内容："+mail.getContent()
                +"\t...发送成功");
    }

    //        Client（客户端）：客户让一个原型对象克隆自身，从而创建一个新的对象
    public static void main(String[] args){
        int i=0;
        int MAX_COUNT=10000000;
        EventTemplate et = new EventTemplate("9月份信用卡账单","国庆抽奖。。。");
        Mail mail = new Mail(et);
        while(i < MAX_COUNT){
            mail.clone();
            mail.setContent(getRandString(5)+"，先生（女士）：您的信用卡账单。。。");
            mail.setReceiver(getRandString(5)+"@"+getRandString(8)+".com");
            sendMail(mail);
            i++;
        }
        System.out.println("ok!!!");
    }
}

