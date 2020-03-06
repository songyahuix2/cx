package java04.day11_手写Array集合.work.Test_2;

/**
 * @author shkstart
 * @date 7/29/2019 - 6:34 PM
 */
public class ClassMain {
    public static void main(String[] args) {
        MailAddressArrayList<MailAddress> addressObj = new MailAddressArrayList<>();
//        name;
//        String teLno;
//        String street;
//        String city;
//        String state;
//        String country;
//        String pincode;
        addressObj.add( new MailAddress("songyahui","15225723153","学堂街","苏州","江苏","中国","477200"));
        addressObj.add( new MailAddress("han","15225726666","学堂街","苏州","江苏","中国","477200"));
        addressObj.add( new MailAddress("liuyahui","15225724145","学堂街","苏州","江苏","中国","477200"));
        addressObj.add( new MailAddress("zhangyahui","15225745132","学堂街","苏州","江苏","中国","477200"));
        addressObj.display(2);

    }
}
