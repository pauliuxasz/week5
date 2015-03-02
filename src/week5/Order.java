/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5;

/**
 *
 * @author 1309400
 */
public class Order {
    private PaymentBehaviour pb;
    
    public Order(PaymentBehaviour paymentb){
        pb = paymentb;
    }
    public double orderValue(){
        return 1;
    }
    
    public void performPayment(){
        pb.makePayment(orderValue());
    }
}
