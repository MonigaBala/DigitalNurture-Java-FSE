import React, { useState } from "react";

function App() {
  const [count, setCount] = useState(0);
  const [amount, setAmount] = useState("");
  const [currency, setCurrency] = useState("");

  // 1. Increment - multiple methods
  const handleIncrement = () => {
    method1();
    method2();
    setCount(count + 1);
  };

  const method1 = () => console.log("Method 1 called");
  const method2 = () => console.log("Method 2 called");

  // 2. Decrement
  const handleDecrement = () => {
    setCount(count - 1);
  };

  // 3. Say Welcome with argument
  const sayWelcome = (msg) => {
    alert(msg);
  };

  // 4. Synthetic Event
  const handleClick = () => {
    alert("I was clicked");
  };

  // 5. Currency Converter
  const handleSubmit = (e) => {
    e.preventDefault();
    const converted = parseFloat(amount) * 80; // INR to Euro (assuming 1 Euro = 80 INR)
    alert(`Converting to ${currency} Amount is ${converted}`);
  };

  return (
    <div style={{ padding: "20px" }}>
      <div>{count}</div>

      <button onClick={handleIncrement}>Increment</button>
      <br />
      <button onClick={handleDecrement}>Decrement</button>
      <br />
      <button onClick={() => sayWelcome("welcome")}>Say welcome</button>
      <br />
      <button onClick={handleClick}>Click on me</button>

      <h2 style={{ color: "green" }}>Currency Convertor!!!</h2>

      <form onSubmit={handleSubmit}>
        <label>Amount:</label>
        <input
          type="text"
          value={amount}
          onChange={(e) => setAmount(e.target.value)}
        />
        <br />
        <label>Currency:</label>
        <input
          type="text"
          value={currency}
          onChange={(e) => setCurrency(e.target.value)}
        />
        <br />
        <button type="submit">Submit</button>
      </form>
    </div>
  );
}

export default App;
