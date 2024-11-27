<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Payment Page</title>
    <style type="text/css">
    body {
    font-family: Arial, sans-serif;
    background-color: #f4f4f4;
    margin: 0;
    padding: 0;
    display: flex;
    justify-content: center;
    align-items: center;
    height: 100vh;
}

.payment-container {
    background-color: #fff;
    padding: 20px;
    border-radius: 8px;
    box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
    width: 300px;
}

h1 {
    margin-bottom: 20px;
    font-size: 24px;
    text-align: center;
}

form {
    display: flex;
    flex-direction: column;
}

label {
    margin-bottom: 5px;
    font-weight: bold;
}

input[type="text"],
textarea,
select {
    margin-bottom: 15px;
    padding: 10px;
    border: 1px solid #ccc;
    border-radius: 4px;
    width: 100%;
    box-sizing: border-box;
}

textarea {
    resize: vertical;
    height: 100px;
}

button {
    padding: 10px;
    border: none;
    border-radius: 4px;
    background-color: #5cb85c;
    color: white;
    font-size: 16px;
    cursor: pointer;
}

button:hover {
    background-color: #4cae4c;
}
    
    </style>
</head>
<body>
    <div class="payment-container">
        <h1>Payment Page</h1>
        <form action="#" method="post">
            <label for="total-amount">Total Amount:</label>
            <input type="text" id="total-amount" name="total-amount" value="${msg3}" required>

            <label for="mode-of-payment">Mode of Payment:</label>
            <select id="mode-of-payment" name="mode-of-payment" required>
                <option value="credit-card">Credit Card</option>
                <option value="debit-card">Debit Card</option>
                <option value="paypal">PayPal</option>
                <option value="bank-transfer">Bank Transfer</option>
            </select>

            <label for="user-name">User Name:</label>
            <input type="text" id="user-name" name="user-name" value="${user}" required>

            <label for="delivery-address">Delivery Address:</label>
            <textarea id="delivery-address" name="delivery-address" required></textarea>

            <button type="submit">Submit Payment</button>
        </form>
    </div>
</body>
</html>
