package service;

import java.util.List;

import po.Item;
import po.Order;
import po.User;

public interface IOrderService {
	// 场地是否可用
	public boolean fieldAvailable(Item item);

	// 提交订单
	public void orderSubmit(Order order);

	// 完成预定
	public boolean orderComplete(int fieldState);

	// 删除订单
	public void deleteOrder(Order order);

	// 查询订单
	public List<Order> getOrder(User user);
}
