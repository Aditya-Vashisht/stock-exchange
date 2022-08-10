Stock Exchange
The Challenge
Implement an order matching system for a stock exchange. Traders place Buy and Sell orders for a stock indicating the price and quantity. Each order gets entered into the exchange’s order-book and remains there until it is matched. Order matching is attempted whenever a new order is added.
The exchange follows a FirstInFirstOut Price-Time order-matching rule, which states that: "The first order in the order-book at a price level is the first order matched. All orders at the same price level are filled according to time priority." The exchange works like a market where lower selling prices and higher buying prices get priority.
A trade is executed when a buy price is greater than or equal to a sell price. The trade is recorded at the price of the sell order regardless of the price of the buy order.
Your program should take as input:
1. Order ID.
2. Time.
3. Stock.
4. Buy/Sell.
5. Price.
6. Quantity.
The output should be
1. Buy Order ID
2. Sell Price
3. Quantity
4. Sell Order ID
