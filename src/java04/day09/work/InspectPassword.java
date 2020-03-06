package java04.day09.work;

/**
 * @author shkstart
 * @date 7/25/2019 - 7:51 PM
 */
public class InspectPassword {
String passWord = null;
    public InspectPassword(String passWord) {
        this.passWord = passWord;
    }
    public void inspect(){
        String PW_PATTERN = "^(?![A-Za-z]+$)(?![A-Z\\d]+$)(?![A-Z\\W]+$)(?![a-z\\d]+$)(?![a-z\\W]+$)(?![\\d\\W]+$)\\S{8,}$";
        boolean flag =false;
    if(passWord.length()>8){
        if(passWord.matches(PW_PATTERN)){
            flag = true;
            System.out.println("密码返回："+flag);
        }
        else
            throw new InvalidPasswordFormatException("密码需要包括大小写字母.数字.其它符号,以上四种至少三种");
    }
    else
        throw new InvalidPasswordFormatException("密码长度需超过八位");
    }
    }



