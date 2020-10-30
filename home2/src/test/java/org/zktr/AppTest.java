package org.zktr;

import static org.junit.Assert.assertTrue;

import javafx.application.Application;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    ApplicationContext ctx,ctx2;

    @Before
    public void setUp() throws Exception {
        ctx = new ClassPathXmlApplicationContext("springbean.xml");
        ctx2 = new ClassPathXmlApplicationContext("rankBean.xml");
    }

    @Test
    public void test1(){
        Order order = ctx.getBean("order",Order.class);
        double totalPrice = 0;
        List<OrderDetails> list = order.getDetails();
        System.out.println("产品编号\t产品名称\t购买数量\t单价\t小计");
        for (OrderDetails ord : list){
            int co = ord.getCount();  //购买数量
            Product product = ord.getProduct();
            double totalPri = co * product.getPrice();//小计
            System.out.println(product.getProid()+"\t"+product.getName()+"\t"+co+"\t"+product.getPrice()+"\t"+totalPri);
            totalPrice += totalPri;
        }
        System.out.println("订单编号\t订单时间\t订单状态\t总额");
        System.out.println(order.getId()+"\t"+(new SimpleDateFormat("yyyy-MM-dd").format(order.getDate()))+"\t"+order.getOrStatus()+"\t"+totalPrice);

    }

    @Test
    public void test2(){
        Rank rank = (Rank) ctx2.getBean("rank");
        System.out.println("班级编号："+rank.getRid()+"\t班级名称："+rank.getRname());
        for(Student stu : rank.getList()){
            System.out.println("学生编号："+stu.getId());
            System.out.println("学生姓名："+stu.getName());
            System.out.println("学生电话："+stu.getPhone());
            System.out.println("出生日期："+(new SimpleDateFormat("yyyy-MM-dd").format(stu.getDate())));
            System.out.println("喜欢的老师：");
            Set<Map.Entry<Integer,String>> set = stu.getLove().entrySet();
            for(Map.Entry<Integer,String> entry: set ){
                System.out.println("\t老师编号："+entry.getKey()+"\t老师职位："+entry.getValue());
            }
        }
    }
}
