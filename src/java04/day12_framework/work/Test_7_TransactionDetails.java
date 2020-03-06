package java04.day12_framework.work;

import java.util.ArrayList;
import java.util.List;

/**
 * @author shkstart
 * @date 7/30/2019 - 8:15 PM
 */
//需要调用的方法包装到该类
class TransDemo{
    List<TransRecord> list = null;
    public TransDemo( List<TransRecord> list)
    {
        this.list = list;
    }
    public TransRecord findByCustomerNumber(String customerNumber){

        for (TransRecord transRecord:list)
        {
            if(transRecord.getCusterNum().equals(customerNumber)==true)
                System.out.println(transRecord);
                return transRecord;
        }
        System.out.println("无该用户号");
        return null;
    }
    public TransRecord  findByDate(String startDate, String endDate){
        if(Integer.valueOf(startDate)<=Integer.valueOf(endDate)){
            throw new ArithmeticException("起始时间不能晚于结束时间");
        }
        for (TransRecord transRecord:list)
        {
            if(Long.parseLong(transRecord.getOccurTime())>=Long.parseLong(startDate) && Long.parseLong(transRecord.getOccurTime())<=Long.parseLong(endDate)){
                System.out.println(transRecord);
                return transRecord;
            }
        }
        System.out.println("未匹配到合适日期");
        return null;
    }
}

//该类中的主函数创建TransDemo类对象，并调用封装再TransDemo类中的方法
public class Test_7_TransactionDetails {
    public static void main(String[] args) {
        //添加TransRecord对象元素
        List<TransRecord> list = new ArrayList<TransRecord>();
        list.add(new TransRecord("000001","刘德华","0000",'男',"4155990188888888","20060720","300.00"));
       list.add(new TransRecord("000002","成龙","0001",'男',"4155990188888889","20060821","300.00"));
       list.add(new TransRecord("000001","黄晓明","0002",'男',"4155990188888890","20060920","300.00"));
       list.add(new TransRecord("000001","张卫健","0003",'男',"4155990188888891","20070720","300.00"));
       list.add(new TransRecord("000001","梁朝伟","0004",'男',"4155990188888892","20050720","300.00"));
       list.add(new TransRecord("000001","梁思成","0005",'男',"4155990188888893","20100720","300.00"));
       list.add(new TransRecord("000001","成吉思汗","0006",'男',"4155990188888894","20180720","300.00"));
        list.add(new TransRecord("000001","凯撒三世","0007",'男',"4155990188888895","20190720","300.00"));


        //调用TransDemo方法
        TransDemo td = new TransDemo(list);
        td.findByCustomerNumber("000001");
    }
}
