<html>
<head>
    <title>Question 3 - Multiplication</title>
</head>
<body>

    <h2>Q3: Multiply the two numbers</h2>

	<!-- Display message directly -->
	<div style="color:red;">${message}</div>
	<br/>


    <form action="/q3" method="post">
        <label for="number1">First number:</label><br>
        <input type="text" id="number1" name="number1" required><br>

        <label for="number2">Second number:</label><br>
        <input type="text" id="number2" name="number2" required><br>

        <label for="result">Multiplication:</label><br>
        <input type="text" id="result" name="result" required><br><br>

        <input type="submit" value="Submit">
    </form>

</body>
</html>
