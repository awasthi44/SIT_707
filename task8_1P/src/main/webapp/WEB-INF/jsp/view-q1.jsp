<html>
<body>

    <h2>Q1: Add the two numbers</h2>

    <!-- Display message directly -->
    <div style="color:red;">${message}</div>
    <br/>

    <form action="/q1" method="post">
        <label for="number1">First number:</label><br>
        <input type="text" id="number1" name="number1" required><br>

        <label for="number2">Second number:</label><br>
        <input type="text" id="number2" name="number2" required><br>

        <label for="result">Your Answer:</label><br>
        <input type="text" id="result" name="result" required><br><br>

        <input type="submit" value="Submit">
    </form>

</body>
</html>
